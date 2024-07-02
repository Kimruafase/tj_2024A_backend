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
    on delete cascade
    on update cascade			-- 회원의 pk값이 탈퇴 / 수정하면 게시물을 어떻게 할 것인지 -- 제약 조건 옵션 설정하기
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
    foreign key(mNo) references member(mNo) on delete cascade on update cascade,
    foreign key(bNo) references board(bNo) on delete cascade on update cascade
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

# 검색
# 1. 전체 검색
select *from member;

# 2. 조건 검색
select *from member where mNo = 1;						-- mno가 '1'인 회원 레코드 검색
select *from member where mId = 'qwer';					-- mId가 'qwer'인 회원 레코드 검색
select *from member where mPhone = '010-5678-5678';		-- mPhone이 '010-5678-5678'인 회원 레코드 검색

# 아이디 찾기 / 비교 (회원명과 연락처가 동일한 회원 검색)
# 비교 연산자 : '>' 초과, '<' 미만, '>=' 이상, '<=' 이하
# 관계 연산자 : and, or, not				vs JAVA : &&, ||, !
# 비교 연산자 : ex_ a = 1 and b = 2			vs JAVA : a == 1 && b = 2
select *from member where mName = '김장훈' and mPhone = '010-0123-0123';
# JDBC DAO SQL 작성 시 : select *from member where mName = ? and mPhone = ?;

# 비밀번호 찾기 / 비교 (아이디와 연락처가 동일한 회원 검색)
select *from member where mId = 'zxcv' and mPhone = '010-0123-0123';
# JDBC DAO SQL 작성 시 : select *from member where mId = ? and mPhone = ?;

# 로그인 / 비교 (아이디와 비밀번호가 동일한 회원 검색)
select *from member where mId = 'zxcv' and mPwd = 'zxc789';
# JDBC DAO SQL 작성 시 : select *from member where mId = ? and mPwd = ?;

# 탈퇴 / delete 
# 1. 회원번호가 '1'인 회원 삭제
delete from member where mNo = 1;

# 2. 회원번호가 '1'이면서 비림번호가 '2'인 회원 삭제
delete from member where mNo = 1 and mPwd = 2;
# JDBC DAO SQL 작성 시 : delete from member where mNo = ? and mPwd = ?;

# 수정
# 1. 회원번호가 '0'인 회원 레코드의 이름을 '유재석'으로 수정
update member set mName = '유재석' where mNo = 0;
# 2. 회원번호가 '0'인 회원 레코드의 이름을 '유재석', 연락처를 '010-9999-9999'로 수정
update member set mName = '유재석', mPhone = '010-9999-9999' where mNo = 0;
# JDBC DAO SQL 작성 시 : update member set mName = ?, mPhone = ? where mNo = ?;

# 조회
# 1. 전체 조회
select *from board;

# 2. 개별 조회 (조건이 추가)
select *from board where bno = 10;	-- 10번 게시물 개별 조회

# 삭제
delete from board where bno = 0;
delete from board where bno = 0 and mno = 0;

# 댓글 출력 / 조회
select *from reply;					-- 댓글 전체 출력
select *from reply where mNo = 0;	-- 회원 번호가 0인 회원이 작성한 댓글 출력
select *from reply where bNo = 0;	-- 게시물 번호가 0인 게시물에 작성된 댓글 출력

# 댓글 쓰기
insert into reply(rContent, mNo, bNo) values("댓글 내용", 3, 1);

insert into reply(rContent, mNo, bNo) value('1번 댓글입니다', 2, 2);
insert into reply(rContent, mNo, bNo) value('1번 댓글입니다', 3, 3);
insert into reply(rContent, mNo, bNo) value('1번 댓글입니다', 4, 4);
insert into reply(rContent, mNo, bNo) value('4번 댓글입니다', 7, 5);
insert into reply(rContent, mNo, bNo) value('1번 댓글입니다', 5, 6);
insert into reply(rContent, mNo, bNo) value('1번 댓글입니다', 6, 7);
insert into reply(rContent, mNo, bNo) value('1번 댓글입니다', 7, 8);
insert into reply(rContent, mNo, bNo) value('1번 댓글입니다', 8, 9);
insert into reply(rContent, mNo, bNo) value('1번 댓글입니다', 9, 10);
insert into reply(rContent, mNo, bNo) value('1번 댓글입니다', 10, 11);

# 게시풀 출력
use day06;
select *from board;

# 게시물 출력시 mNo 가 아닌 mId 를 출력
	# 1. 두 테이블을 출력한다.
select *from board, member;
	# 2. 두 테이블의 관계 기준으로 join 한다.
select *from board, member where board.mNo = member.mNo;
select *from board natural join member;
select *from board join member on board.mNo = member.mNo;
select *from board join member using(mNo);
select *from board inner join member on board.mNo = member.mNo;
	# 테이블 명이 길 경우 간소화 -> 별칭 작성
select *from board b inner join member m on b.mNo = m.mNo;

# 댓글 출력 
select *from reply;
select *from reply inner join member on reply.mNo = member.mNo;
select *from reply inner join member on reply.mNo = member.mNo where reply.bNo = 5;

# 조회수 증가 처리, 조회수 1 증가, 기존 필드값을 변경, update
update board set bView = 1;
update board set bView = bView + 1;
update board set bView = bView + 1 where bNo = 0;