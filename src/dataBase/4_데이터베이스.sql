# 데이터베이스 생성
drop database if exists day04;		# 만약 day04가 있다면 삭제
create database day04;				# day04 폴더 생성
use day04;							# day04 폴더 사용(이동)

# 테이블 생성
drop table if exists table1;			# 만약 table1이 있다면 삭제
create table table1(					# table1 생성	
	mno int,							# table1 안에 int로 mno 생성
    mname varchar(30) not null unique	# table1 안에 varchar(30)으로 null값 포함 x, 겹치는 값이 없게 생성
);

# DML : 조작어
# 1. INSERT 2. SELECT 3. UPDATE 4. DELETE
# >	  (C)		(R)		  (U)		(D)

/*
	[1]	INSERT : 레코드(행, 튜플, 가로 단위) 삽입
		1. 모든 필드에 값 대입 	> insert into 테이블명 values(값1, 값2, 값3, ...);
        2. 특정 필드에 값 대입 	> insert into 테이블명(필드명, 필드명) values(값1, 값2);
        3. 여러 개의 레코드 삽입 > insert into 테이블명(필드명, 필드명) values(값1, 값2), (값1, 값2), (값1, 값2), (값1, 값2);
        
	[2] SELECT : 레코드(행, 튜플, 가로단위) 조회 / 검색 찾기		
		1. 전체 필드 조회 	> select *(와일드 카드) from 테이블명;
        2. 특정 필드 조회 	> select 필드명1, 필드명2 from 테이블명;
        3. 레코드 조건 조회 > select 필드명1, 필드명2 from 테이블명 where 조건절; 	
	
    [3] UPDATE : 레코드(행, 튜플, 가로단위) 필드 값 수정
		1. 특정 필드의 전체 값 수정 > update 테이블명 set 수정할 필드명 = 새로운 값;
        2. 특정 필드의 특정 값 수정 > update 테이블명 set 수정할 필드명1 = 새로운 값 where 필드명2 = 수정하고 싶은 레코드;
        
	[4] DELETE : 레코드(행, 튜플, 가로단위) 삭제
		1.   특정 레코드 삭제 			 > delete from 테이블명 where 조건절;
        2.   전체 레코드 삭제 			 > delete from 테이블명;
        2-1. 전체 레코드 삭제 ver2 (DDL) > truncate table 테이블명;
*/

# [1] INSERT : 레코드(행, 튜플, 가로 단위) 삽입
# 1. 모든 필드에 값 대입 > insert into 테이블명 values(값1, 값2, 값3, ...);
insert into table1 values(1, '박명수');
# 2. 특정 필드에 값 대입 > insert into 테이블명(필드명, 필드명) values(값1, 값2);
insert into table1(mno, mname) values(2, '유재석');
insert into table1(mname, mno) values('신동엽', 3);
insert into table1(mname) values('서장훈');

# 3. 여러 개의 레코드 삽입 > insert into 테이블명(필드명, 필드명) values(값1, 값2), (값1, 값2), (값1, 값2), (값1, 값2);
insert into table1 values(4, '강호동'), (5, '김희철');

# 확인
select *from table1;

# [2] SELECT : 레코드(행, 튜플, 가로단위) 조회 / 검색 찾기			>> 정보 처리 기사 거의 필수 출제 <<
# 1. 전체 필드 조회 > select *(와일드 카드) from 테이블명;			# * : 모든 필드를 조회하는 전체 레코드 검색
select *from table1;

# 2. 특정 필드 조회 > select 필드명1, 필드명2 from 테이블명;
select mno from table1;
select mname from table1;
select mname, mno from table1;

# 3. 레코드 조건 조회 > select 필드명1, 필드명2 from 테이블명 where 조건절 	
select *from table1 where mname = '유재석';					# '=' 같다. (java, js처럼 '='은 대입이 아니다.)
		# table1 의 mname 필드 내 '유재석'인 데이터의 레코드 검색
        
# [3] UPDATE : 레코드(행, 튜플, 가로단위) 필드 값 수정
# 1. 특정 필드의 전체 값 수정 > update 테이블명 set 수정할 필드명 = 새로운 값;
update table1 set mno = 10;					# 테이블의 mno 필드를 10으로 수정

# 2. 특정 필드의 특정 값 수정 > update 테이블명 set 수정할 필드명1 = 새로운 값 where 필드명2 = 수정하고 싶은 레코드;
update table1 set mno = 3 where mname = '유재석';
		# 테이블의 mname 필드 내 '유재석' 값인 레코드의 mno 필드 값을 3으로 수정
update table1 set mname = '유재석B' where mno = 3;
		# 테이블의 mno 필드가 3인 레코드의 mname 필드 값을 '유재석B'로 수정

select *from table1;

# [4] DELETE : 레코드(행, 튜플, 가로단위) 삭제
# 1. 특정 레코드 삭제 > delete from 테이블명 where 조건절;
delete from table1 where mno = 3;			# 테이블에 mno 필드가 3인 레코드를 삭제
delete from table1 where mname = '강호동';	# 테이블에 mname 필드가 '강호동'인 레코드를 삭제

# 2. 전체 레코드 삭제 > delete from 테이블명;
delete from table1;							# 전체 레코드 삭제(레코드 하나씩 삭제, 느림, 취소 가능)
	# vs
truncate table table1;						# 전체 레코드 삭제(레코드 전체 처리, 좀 더 빠름, 취소 불가능)

# update, delete는 workbench 에서 기본적으로 차단 > safe mode
# safe mode 끄기
SET SQL_SAFE_UPDATES = 0;			# safe mode = 0 : 해제, 1 : 사용

# 문제 1
insert into employees(imployee_id, first_name, last_name, email, hire_date, job_id) values(101, 'John', 'Doe', 'johndoe@example.com', '2024-06-24', 'IT_PROG');

# 문제 2
insert into products(product_id, product_name, category, price, stock_quantity) values(201, 'Wireless Mouse','Electronics', 29.99 ,150);

# 문제 3
select first_name, email from employees;

# 문제 4
select price, product_name from products where price = 1000;

# 문제 5
update employees set email = 'john.doe@company.com' where employee_id = 101;

# 문제 6
update products set price = 24.99 where product_id = 201;

# 문제 7
delete from employees where employees_id = 101;

# 문제 8
delete from products where product_id = 201;
