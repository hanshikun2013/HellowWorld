drop table T_LRMS_CARE_HOSHO_KIHON cascade constraints;
create table T_LRMS_CARE_HOSHO_KIHON (
	PLAN_ID Varchar2(36) not null,
	AGENT_ID Varchar2(8),
	CUST_ID Varchar2(30),
	BUNSEKI_SB_CD Char(2),
	BUNSEKI_CREATE_DATE Date,
	BUNSEKI_UPDATE_DATE Date,
	BUNSEKI_COMMENT Varchar2(30),
	SEKKEI_PLAN_NO Varchar2(20),
	INSURED_ID Varchar2(17),
	CARE_TYPE_CD Char(1),
	ZITK_SSET_CARE_CD Char(1),
	CARE_HITSUYO_NENSU Number(2),
	JZKGHS_ICHIJIKIN Number(11),
	JZKGHS_NENKIN Number(11),
	JZKGHS_NENKIN_KIKAN Number(2),
	JZKGHS_KIKAN Number(2),
	JZKGHS_KIKAN_TANI_CD Char(1),
	JZKGHS_HARAIKOMIKIKAN Number(2),
	JZKGHS_HARAIKOMI_TANI_CD Char(1),
	JZKGHS_W_UMU_CD Char(1),
	SYSTEM_CREATE_DATE Date not null,
	SYSTEM_UPDATE_DATE Date not null,
	constraint PK_RMS_CARE_HOSHO_KIHON primary key (PLAN_ID) using index tablespace TS_NVTI
) tablespace TS_NVTT;
comment on table T_LRMS_CARE_HOSHO_KIHON is 'LRMS���ۏᕪ�͊�{';
comment on column T_LRMS_CARE_HOSHO_KIHON.CUST_ID is '�ڋqID';
comment on column T_LRMS_CARE_HOSHO_KIHON.BUNSEKI_SB_CD is '���͎�ʃR�[�h';
comment on column T_LRMS_CARE_HOSHO_KIHON.BUNSEKI_CREATE_DATE is '���͎��{��';
comment on column T_LRMS_CARE_HOSHO_KIHON.BUNSEKI_UPDATE_DATE is '���͍ŏI�X�V��';
comment on column T_LRMS_CARE_HOSHO_KIHON.BUNSEKI_COMMENT is '���͈ꗗ�R�����g';
comment on column T_LRMS_CARE_HOSHO_KIHON.SEKKEI_PLAN_NO is '�݌v�v����NO';
comment on column T_LRMS_CARE_HOSHO_KIHON.INSURED_ID is '��ی��҂h�c';
comment on column T_LRMS_CARE_HOSHO_KIHON.CARE_TYPE_CD is '���^�C�v�R�[�h';
comment on column T_LRMS_CARE_HOSHO_KIHON.ZITK_SSET_CARE_CD is '�ݑ�/�{�݉��ڍ׃R�[�h';
comment on column T_LRMS_CARE_HOSHO_KIHON.CARE_HITSUYO_NENSU is '���K�v�N��';
comment on column T_LRMS_CARE_HOSHO_KIHON.JZKGHS_ICHIJIKIN is '�����ω��ۏ�ꎞ��';
comment on column T_LRMS_CARE_HOSHO_KIHON.JZKGHS_NENKIN is '�����ω��ۏ�N��';
comment on column T_LRMS_CARE_HOSHO_KIHON.JZKGHS_NENKIN_KIKAN is '�����ω��ۏ�N��������';
comment on column T_LRMS_CARE_HOSHO_KIHON.JZKGHS_KIKAN is '�����ω��ۏ����';
comment on column T_LRMS_CARE_HOSHO_KIHON.JZKGHS_KIKAN_TANI_CD is '�����ω��ۏ���ԒP�ʃR�[�h';
comment on column T_LRMS_CARE_HOSHO_KIHON.JZKGHS_HARAIKOMIKIKAN is '�����ω��ۏᕥ������';
comment on column T_LRMS_CARE_HOSHO_KIHON.JZKGHS_HARAIKOMI_TANI_CD is '�����ω��ۏᕥ�����ԒP�ʃR�[�h';
comment on column T_LRMS_CARE_HOSHO_KIHON.JZKGHS_W_UMU_CD is '�����ω��ۏ�Ԗߋ��L���R�[�h';
comment on column T_LRMS_CARE_HOSHO_KIHON.SYSTEM_CREATE_DATE is '�V�X�e���쐬����';
comment on column T_LRMS_CARE_HOSHO_KIHON.SYSTEM_UPDATE_DATE is '�V�X�e���X�V����';
