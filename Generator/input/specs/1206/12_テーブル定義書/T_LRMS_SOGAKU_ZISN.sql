drop table T_LRMS_SOGAKU_ZISN cascade constraints;
create table T_LRMS_SOGAKU_ZISN (
	PLAN_ID Varchar2(36) not null,
	SEQ Number(1) not null,
	SOZOKU_ZISN_CD Char(2),
	SOZOKU_GAKU Number(11),
	HTSZN_SB_KOBETSU_CD Char(2),
	SYSTEM_CREATE_DATE Date not null,
	SYSTEM_UPDATE_DATE Date not null,
	constraint PK_RMS_SOGAKU_ZISN primary key (PLAN_ID,SEQ) using index tablespace TS_NVTI
) tablespace TS_NVTT;
comment on table T_LRMS_SOGAKU_ZISN is 'LRMS�������Y���';
comment on column T_LRMS_SOGAKU_ZISN.SOZOKU_ZISN_CD is '�������Y�R�[�h';
comment on column T_LRMS_SOGAKU_ZISN.SOZOKU_GAKU is '�������Y�]���z';
comment on column T_LRMS_SOGAKU_ZISN.HTSZN_SB_KOBETSU_CD is '�@�葊���l��ʁi�ʁj�R�[�h';
comment on column T_LRMS_SOGAKU_ZISN.SYSTEM_CREATE_DATE is '�V�X�e���쐬����';
comment on column T_LRMS_SOGAKU_ZISN.SYSTEM_UPDATE_DATE is '�V�X�e���X�V����';
