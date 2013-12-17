drop table T_LRMS_SOGAKU_KIHON cascade constraints;
create table T_LRMS_SOGAKU_KIHON (
	PLAN_ID Varchar2(36) not null,
	AGENT_ID Varchar2(8),
	CUST_ID Varchar2(30),
	BUNSEKI_SB_CD Char(2),
	BUNSEKI_CREATE_DATE Date,
	BUNSEKI_UPDATE_DATE Date,
	BUNSEKI_COMMENT Varchar2(30),
	SEKKEI_PLAN_NO Varchar2(20),
	INSURED_ID Varchar2(17),
	SPOUSE_UMU_CD Char(1),
	HTSZN_SB_CD Char(1),
	HTSZN_CNT Number(1),
	SYSTEM_CREATE_DATE Date not null,
	SYSTEM_UPDATE_DATE Date not null,
	constraint PK_RMS_SOGAKU_KIHON primary key (PLAN_ID) using index tablespace TS_NVTI
) tablespace TS_NVTT;
comment on table T_LRMS_SOGAKU_KIHON is 'LRMS������{���';
comment on column T_LRMS_SOGAKU_KIHON.CUST_ID is '�ڋqID';
comment on column T_LRMS_SOGAKU_KIHON.BUNSEKI_SB_CD is '���͎�ʃR�[�h';
comment on column T_LRMS_SOGAKU_KIHON.BUNSEKI_CREATE_DATE is '���͎��{��';
comment on column T_LRMS_SOGAKU_KIHON.BUNSEKI_UPDATE_DATE is '���͍ŏI�X�V��';
comment on column T_LRMS_SOGAKU_KIHON.BUNSEKI_COMMENT is '���͈ꗗ�R�����g';
comment on column T_LRMS_SOGAKU_KIHON.SEKKEI_PLAN_NO is '�݌v�v����NO';
comment on column T_LRMS_SOGAKU_KIHON.INSURED_ID is '��ی��҂h�c';
comment on column T_LRMS_SOGAKU_KIHON.SPOUSE_UMU_CD is '�z��җL���R�[�h';
comment on column T_LRMS_SOGAKU_KIHON.HTSZN_SB_CD is '�@�葊���l��ʃR�[�h';
comment on column T_LRMS_SOGAKU_KIHON.HTSZN_CNT is '�@�葊���l��';
comment on column T_LRMS_SOGAKU_KIHON.SYSTEM_CREATE_DATE is '�V�X�e���쐬����';
comment on column T_LRMS_SOGAKU_KIHON.SYSTEM_UPDATE_DATE is '�V�X�e���X�V����';
