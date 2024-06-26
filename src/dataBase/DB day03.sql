# 데이터베이스 생성
drop database if exists day03;
create database day03;

# 테이블 생성
use day03;
drop table if exists member;
create table member(
	회원번호 int,
    아이디 varchar(30),
    비밀번호 varchar(30),
    연락처 char(13),
	광고전송여부 boolean,
    가입일 datetime
);
show tables;			# 현재 DB 내 모든 테이블 확인
select *from member;	# 테이블 검색

# 제약 조건
# 1. not null : 해당 필드에 null 값을 포함하지 않는다.
		-- (레코드[insert] 등록 시 해당 필드에 대입 값이 없을 때 기본적으로 null이 대입)
create table t1(tno int not null, tname varchar(10));
	# 레코드 / 행 / 튜플 추가
		# values(값1, 값2) 만약에 앞에 필드명을 생략 시 필드명 순서대로 값 대입
insert into t1 values(1, '유재석');
		# values(값1, 값2) 만약에 앞에 필드명을 작성 시 명시된 순서대로 값 대입
insert into t1(tno, tname) values(2, '강호동');
insert into t1(tname, tno) values('하하', 3);

insert into t1(tname) values('서장훈');	# 오류 O -> 값을 대입하지 않는 필드가 not null 이기 때문에
insert into t1(tno) values(4);			# 오류 X -> 값을 대입하지 않는 필드가 not null 하지 않았기 때문에
# 확인
select *from t1;

# 2. default : 해당 필드의 기본값 설정
	-- 만약에 레코드 삽입 시 해당 필드에 값을 대입하지 않으면 기본값으로 설정할 값
create table t2(
	tno int not null, 
	tname varchar(10), 
	tdate datetime default now(), 
    tstate int default 10
);
	# 레코드 추가
insert into t2(tno, tname) values(1, '유재석');	# 생략된 tdate, tstate
insert into t2 values(1, '강호동', '2024-06-21 11:00:30' , 3);

# 확인
select *from t2;

# 3. unique : 해당 필드 내 중복된 값을 허용하지 않는다. [중복 제거]
	-- 만약에 레코드 삽입 시 해당 필드에 값을 대입할 때 기존 레코드 내 동일 값이 있다면 오류 발생
create table t3(tno int not null unique, tname varchar(10), tpoint int default 100);
	# 레코드 추가
insert into t3(tno) values(1);	#
insert into t3(tno, tname) values(1, '유재석');	# tno에 동일한 값이 존재해서 오류 발생

# 확인
select *from t3;

# 4. auto_increment : 레코드 삽입 시 해당 필드 내 자동번호 부여
create table t4(
	tno int not null unique auto_increment, 
	tname varchar(10) default '아무개'
);
insert into t4(tname) values('유재석');
delete from t4 where tno = 3; # tno가 '3'인 레코드 삭제;
	# 레코드 삭제 후 레코드 생성 -> 삭제된 자동번호는 더 이상 생성되지 않고 마지막 번호에 이어서 1씩 증가
#확인
select *from t4;

# 5. primary key : 기본 키, 레코드 내 식별 가능한 고유값을 가진 키, 참조 당하는 키
	-- unique 포함, not null 포함
    -- primary key(선정할 필드명)
create table t5(
	tno_pk int,
    tname varchar(30),
    primary key(tno_pk)
);
select *from t5;

# 6. foreign key : 외래 키, 다른 테이블 내 기본키를 참조하는 키, 참조하는 키
create table t6(
	title text,
    tno_fk int,
    foreign key(tno_fk) references t5(tno_pk)
);
select *from t6;

# 체크 벤치 상단 메뉴 -> Database(단축키_Ctrl + R) -> Reverse Engineering

# 1. 회원
create table m(
	mno_pk int, 
	mname varchar(10), 
	mphone varchar(10),
    primary key(mno_pk)		# 해당 필드를 pk로 설정
);

# 2. 게시물
create table b(
	bno_pk int, 
	btitle varchar(100),
	bcontent longtext,
	bdate datetime default now(),
    mno_fk int, 
    primary key(bno_pk),						# 해당 필드를 pk로 설정		
    foreign key(mno_fk) references m(mno_pk)	# 해당 필드를 fk로 설정
);

# 3. 게시물 댓글
create table r(
	rno_pk int,
    rcontent text,
    rpwd varchar(20),
    bno_fk int,
    mno_fk int,
    primary key(rno_pk),						# 해당 필드를 pk로 설정
    foreign key(bno_fk) references b(bno_pk),	# 해당 필드를 fk로 설정
    foreign key(mno_fk) references m(mno_pk)	# 해당 필드를 fk로 설정
);

drop table if exists r;

create table categoryTable(
	categoryName varchar(10), 
	categoryNum int auto_increment unique,
    primary key(categoryNum)
);
create table menuTable(
	menuName varchar(10) unique,
    menuPrice int,
    menuNum int auto_increment unique,
    primary key(menuNum),
    categoryNum int,
    foreign key(categoryNum) references categoryTable(categoryNum)
);
create table orderTable(
	orderAmount tinyint,
    orderNum int auto_increment unique,
    primary key(orderNum),
    menuName varchar(10),
    menuNum int,
    foreign key(menuNum) references menuTable(menuNum)
);
create table orderTimeTable(
	orderRegTime datetime default now(),
    orderNum int,
    foreign key(orderNum) references orderTable(orderNum)
);
    
