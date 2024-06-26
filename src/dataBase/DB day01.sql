/* 여러 줄 주석 */
# 한 줄 주석
-- 한 줄 주석
/* SQL 질의어 */
/*
	1. 주의할 점
		> SQL 명령어 문장을 입력 후 ';'로 끝내야 함.
        > 문자 처리 ' ' or " "
        > 명령어 / 키워드 에서는 대소문자 구분 안 함, 데이터 / 자료는 당연히 구분함
	2. 실행
		- 명령어 단위 실행, 전체 실행
        - 명령어 단위 실행 : 실행 명령어에 커서 두고 [ctrl + enter] or [상단에 번개 모양의 I]
        - 전체 명령어 실행 : [ctrl + shift + enter] or [상단 번개모양의 I 없는 버튼]
	----------------------------------------------------------------------
    
    DDL (Data Definition Language) 데이터 정의어 (주로 생성)
		> create
			> create database 새로운 DB명;					>> 데이터베이스 생성
				> drop database if exists 삭제할 DB명;		>> 데이터베이스 삭제
		> 그 외
        > show
			> show databases;							>> DB SERVER 내 데이터베이스 목록 확인
            > swho variables like 'datadir';			>> DB SERVER 내 데이터베이스 local 위치 확인
		> use
			> use 사용할 데이터베이스명;						>> DB SERVER 내 조작 / 사용할 데이터베이스 선택
    DML (Data Manipulation Language) 데이터 조작어 
    
    DCL (Data Control Language) 데이터 제어어
*/
# 1. 현재 DB SERVER에 존재하는 데이터베이스 확인
show databases;

# 2. 현재 DB SERVER에 존재하는 로컬(C:DRIVE) 위치 확인
show variables like "datadir"; # C:\ProgramData\MySQL\MySQL Server 8.0\Data\

# 3. 현재 DB SERVER 내 데이터베이스 생성
create database myDB; # C:\ProgramData\MySQL\MySQL Server 8.0\Data\myDB

# 4. 데이터베이스 삭제
drop database myDB;

# 4-1. 만약에 해당 데이터베이스가 존재하면 삭제
drop database if exists myDB;

# 5. DB SERVER에는 여러개의 데이터베이스 존재
use myDB;
/*
	[실습1]
    아래와 같이 순서대로 SQL문을 작성하여 실행하시오.
	1. 'test2' 이름의 데이터베이스가 존재하면 삭제하기.
    2. 'test2' 이름의 데이터베이스 생성하기.
    3. 데이터베이스 목록 확인
    4. 로컬 PC에 데이터베이스가 만들어졌는지 확인하기.
    5. 'test2' 데이터베이스 사용 활성화하기.
*/
drop database if exists test2;
create database test2;
show databases;
show variables like "datadir";
use test2;