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
comment on table T_LRMS_SOGAKU_ZISN is 'LRMS相続財産情報';
comment on column T_LRMS_SOGAKU_ZISN.SOZOKU_ZISN_CD is '相続財産コード';
comment on column T_LRMS_SOGAKU_ZISN.SOZOKU_GAKU is '相続財産評価額';
comment on column T_LRMS_SOGAKU_ZISN.HTSZN_SB_KOBETSU_CD is '法定相続人種別（個別）コード';
comment on column T_LRMS_SOGAKU_ZISN.SYSTEM_CREATE_DATE is 'システム作成日時';
comment on column T_LRMS_SOGAKU_ZISN.SYSTEM_UPDATE_DATE is 'システム更新日時';
