drop database if exists day06;
create database day06;
use day06;

# 1. 회원 테이블
drop table if exists member;
create table member(			# 아이디, 비밀번호, 이름, 연락처, 가입일, 회원번호(pk, auto_increment)
	mId varchar(30) not null unique,
    mPwd varchar(30) not null,
    mName varchar(20) not null,
    mPhone varchar(15) not null,
    mDate datetime default now(),
    mNo int auto_increment,
    primary key(mNo)
);
select *from member; -- 확인용
# 2. 게시물 테이블
drop table if exists board;
create table board(				# 글 제목, 글 내용, 글 작성일, 글 조회수, 글 작성자
	bTitle varchar(100) not null,
    bContent longtext,
    bDate datetime default now(),
    bView smallint default 0,
    mNo int,
	bNo int auto_increment,
    primary key(bNo),
    foreign key(mNo) references member(mNo)
);
select *from board; -- 확인용
# 3. 댓글 테이블
drop table if exists reply;
create table reply(				# 댓글 내용, 댓글 작성일, 댓글 작성자
	rContent varchar(200) not null,
    rDate datetime default now(),
    mNo int,
    bNo int,
    rNo int auto_increment,
    primary key(rNo),
    foreign key(mNo) references member(mNo),
    foreign key(bNo) references board(bNo)
);
select *from reply;

# ERR 다이어그램 확인

# 샘플 데이터 등록
# 회원 5명
insert into member(mId, mPwd, mName, mPhone) values('qwer', 'qwe123', '김민석', '010-1234-1234');
insert into member(mId, mPwd, mName, mPhone) values('asdf', 'asd456', '강호동', '010-5678-5678');
insert into member(mId, mPwd, mName, mPhone) values('zxcv', 'zxc789', '김장훈', '010-0123-0123');
insert into member(mId, mPwd, mName, mPhone) values('ghjk', 'ghj012', '고창석', '010-4567-4567');
insert into member(mId, mPwd, mName, mPhone) values('tyui', 'tyu345', '신동엽', '010-8901-8901');

# 게시물 5개
insert into board(bTitle, bContent, mNo) values('1번 제목입니다.', '1번 내용입니다', 1);	# 김민석이 쓴 글
insert into board(bTitle, bContent, mNo) values('2번 제목입니다.', '2번 내용입니다', 5);	# 신동엽이 쓴 글
insert into board(bTitle, bContent, mNo) values('3번 제목입니다.', '3번 내용입니다', 3);	# 김장훈이 쓴 글
insert into board(bTitle, bContent, mNo) values('4번 제목입니다.', '4번 내용입니다', 2);	# 강호동이 쓴 글
insert into board(bTitle, bContent, mNo) values('5번 제목입니다.', '5번 내용입니다', 4);	# 고창석이 쓴 글

# 댓글 5개
insert into reply(rContent, mNo, bNo) value('1번 댓글입니다', 1, 1);	# 1번 게시물에 1번 회원(김민석)이 쓴 댓글
insert into reply(rContent, mNo, bNo) value('2번 댓글입니다', 5, 1);	# 1번 게시물에 5번 회원(신동엽)이 쓴 댓글
insert into reply(rContent, mNo, bNo) value('3번 댓글입니다', 2, 3);	# 3번 게시물에 2번 회원(강호동)이 쓴 댓글
insert into reply(rContent, mNo, bNo) value('4번 댓글입니다', 1, 4);	# 4번 게시물에 1번 회원(김민석)이 쓴 댓글
insert into reply(rContent, mNo, bNo) value('5번 댓글입니다', 3, 1);	# 1번 게시물에 3번 회원(김장훈)이 쓴 댓글

# 샘플 확인
select *from member;
select *from board;
select *from reply;