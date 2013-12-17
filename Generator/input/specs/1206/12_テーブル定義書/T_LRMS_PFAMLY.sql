drop table T_LRMS_PFAMLY cascade constraints;
create table T_LRMS_PFAMLY (
	PLAN_ID Varchar2(36) not null,
	FAMILY_CD Char(2) not null,
	FAMILY_NAME_KANJI Varchar2(64),
	FAMILY_NAME_KANA Varchar2(64),
	BIRTH Date,
	AGE Number(3),
	BIRTH_AGE_SELECT_CD Char(1),
	ZOKUGARA_CD Char(2),
	SEX_CD Char(1),
	JOB_CD Char(2),
	NENSHU Number(11),
	NYUSHA_AGE Number(3),
	TAISHOKU_PLAN_AGE Number(3),
	HEIKIN_YOMEI Number(3),
	IMEJI_GAZOU_CD Char(8),
	SYSTEM_CREATE_DATE Date,
	SYSTEM_UPDATE_DATE Date,
	constraint PK_RMS_PFAMLY primary key (PLAN_ID,FAMILY_CD) using index tablespace TS_NVTI
) tablespace TS_NVTT;
comment on table T_LRMS_PFAMLY is 'LRMSプラン家族';
comment on column T_LRMS_PFAMLY.FAMILY_NAME_KANJI is '家族氏名（漢字）';
comment on column T_LRMS_PFAMLY.FAMILY_NAME_KANA is '家族氏名（カナ）';
comment on column T_LRMS_PFAMLY.BIRTH is '生年月日';
comment on column T_LRMS_PFAMLY.AGE is '年齢';
comment on column T_LRMS_PFAMLY.BIRTH_AGE_SELECT_CD is '生年月日・年齢選択コード';
comment on column T_LRMS_PFAMLY.ZOKUGARA_CD is '続柄コード';
comment on column T_LRMS_PFAMLY.SEX_CD is '性別コード';
comment on column T_LRMS_PFAMLY.JOB_CD is '職業コード';
comment on column T_LRMS_PFAMLY.NENSHU is '年収';
comment on column T_LRMS_PFAMLY.NYUSHA_AGE is '入社年齢';
comment on column T_LRMS_PFAMLY.TAISHOKU_PLAN_AGE is '退職予定年齢';
comment on column T_LRMS_PFAMLY.HEIKIN_YOMEI is '平均余命';
comment on column T_LRMS_PFAMLY.IMEJI_GAZOU_CD is 'イメージ画像コード';
comment on column T_LRMS_PFAMLY.SYSTEM_CREATE_DATE is 'システム作成日時';
comment on column T_LRMS_PFAMLY.SYSTEM_UPDATE_DATE is 'システム更新日時';
