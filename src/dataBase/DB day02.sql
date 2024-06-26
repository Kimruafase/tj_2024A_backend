/*
	* 테이블 / 표 관련
    관련 용어
		[관점 차이에 따른 용어]
		파일 시스템		데이터베이스 모델링		관계형 데이터베이스
        파일				엔티티				테이블, 릴레이션
        레코드			튜플					행
        필드				속성					열
        
		1. 테이블(Table)	> 표, 릴레이션(Relation), 엔티티(Entity)
        2. 레코드(Record)	> 튜플(tuple), 행(row)
        3. 필드(Field)	> 속성(Attribute), 열(column)
        
	* MySQL 데이터 타입
    [정수]
		1. TINYINT		1바이트		-128 ~ +127
        2. SMALLINT		2바이트		+-3만 정도
        3. MEDIUMINT	3바이트		+-800만 정도
        4. * INT		4바이트		+-20억 정도
        5. BIGINT		8바이트		+-20억 이상
	
    [실수 : 부동소수점, 오차 발생]
		1. FLOAT		4바이트
        2. DOUBLE		8바이트
	
    [문자 형태로 저장되는 숫자, 오차 없는 실수 표현]
		1. DECIMAL		> 실수를 오차 없이 표현할 때 사용
	
    [날짜]
		1. DATE			> 날짜 1000년 ~ 9999년
        2. DATETIME		> 날짜와 시간 표현
        
	[문자]
		1. * CHAR(문자길이)		> 고정 길이
			ex_ CHAR(5)			> 유재석 -> [유] [재] [석] [] []
        2. * VARCHAR(문자길이)	> 가변 길이
			ex_ VARCHAR(5)		> 유재석 -> [유] [재] [석] [] [] -> [유] [재] [석]
		3. TEXT					> 최대 길이 6만개 글자 표현
        4. LONGTEXT				> 최대 길이 42억개 글자 표현
        
	[논리]
		1. BOOL					> true, false
*/ 
# !!!!!!!!!! 어떤 데이터베이스에 테이블을 생성할 것인지 정해야한다.
use mydb;
# 1. 테이블 생성 create table 테이블명(열이름 1, 열이름 2)
create table t_member(이름 text, 점수 int);
# 2. 현재 데이터베이스 내 테이블 목록 조회
show tables;
# 3. 테이블 삭제
drop table t_member;
# 3-1. 만약에 테이블이 존재하면 삭제
drop table if exists t_member;

# [예 1]
drop database if exists sqlweb1;
create database sqlweb1;
use sqlweb1;
drop table if exists member;
create table member(id varchar(20), password varchar(20), age int, joindate datetime);
show tables;
select * from member; # 테이블 확인

# [예 2]
drop table if exists board;
create table board(
	bno int, 				# 번호 (정수)
	title varchar(100), 	# 제목 (최대 100글자)
	contents longtext, 		# 내용 (긴 글 최대 4G)
	view int, 				# 조회수 (정수)
	date datetime			# 작성일 (날짜와 시간)
);
show tables;
select *from board;

# [예 3]
drop table if exists student;
create table student(
	정수1 tinyint,
    정수2 smallint,
    정수3 mediumint,
    정수4 int,
	정수5 bigint,
    실수1 float,
    실수2 double,
    실수3 decimal,
    날짜 date,
    날짜시간 datetime,
    문자열1 char(100),
    문자열2 varchar(100),
    문자열3 text,
    문자열4 longtext,
    논리 bool
);
show tables;
select *from student;

# [실습 1]
/*
	* 키오스크 개발의 메모리 설계
		[요구사항]
			1. 여러 개의 카테고리 중에 하나의 카테고리 선택을 해서 카테고리별로 제품들을 출력 / 확인
            2. 해당 제품을 선택해서 수량 입력 받아 주문처리 > 단) 하나의 주문에 여러 개의 제품을 주문할 수 있다.
            3. 주문번호를 받아서 대기한다.
		[메모리 설계 필수 속성]
			식별자 코드, 카테고리명, 가격, 제품명, 주문수량, 주문날짜
*/

drop table if exists categoryTable;
drop table if exists productTable;
drop table if exists orderDetailTable;
drop table if exists orderTable;

create table categoryTable(categoryCode int, categoryName varchar(10));
create table productTable(productCode int, productName varchar(20), productPrice int, categoryCode int);
create table orderDetailTable(orderDetailCode int, productCode int, orderAmount tinyint, orderCode int);
create table orderTable(orderCode int, orderTime datetime);

show tables;
select *from categoryTable;
select *from productTable;
select *from orderDetailTable;
select *from orderTable;
