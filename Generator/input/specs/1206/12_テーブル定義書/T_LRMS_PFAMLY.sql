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
comment on table T_LRMS_PFAMLY is 'LRMS�v�����Ƒ�';
comment on column T_LRMS_PFAMLY.FAMILY_NAME_KANJI is '�Ƒ������i�����j';
comment on column T_LRMS_PFAMLY.FAMILY_NAME_KANA is '�Ƒ������i�J�i�j';
comment on column T_LRMS_PFAMLY.BIRTH is '���N����';
comment on column T_LRMS_PFAMLY.AGE is '�N��';
comment on column T_LRMS_PFAMLY.BIRTH_AGE_SELECT_CD is '���N�����E�N��I���R�[�h';
comment on column T_LRMS_PFAMLY.ZOKUGARA_CD is '�����R�[�h';
comment on column T_LRMS_PFAMLY.SEX_CD is '���ʃR�[�h';
comment on column T_LRMS_PFAMLY.JOB_CD is '�E�ƃR�[�h';
comment on column T_LRMS_PFAMLY.NENSHU is '�N��';
comment on column T_LRMS_PFAMLY.NYUSHA_AGE is '���ДN��';
comment on column T_LRMS_PFAMLY.TAISHOKU_PLAN_AGE is '�ސE�\��N��';
comment on column T_LRMS_PFAMLY.HEIKIN_YOMEI is '���ϗ]��';
comment on column T_LRMS_PFAMLY.IMEJI_GAZOU_CD is '�C���[�W�摜�R�[�h';
comment on column T_LRMS_PFAMLY.SYSTEM_CREATE_DATE is '�V�X�e���쐬����';
comment on column T_LRMS_PFAMLY.SYSTEM_UPDATE_DATE is '�V�X�e���X�V����';
