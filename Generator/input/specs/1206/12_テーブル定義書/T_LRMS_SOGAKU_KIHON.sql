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
comment on table T_LRMS_SOGAKU_KIHON is 'LRMS相続基本情報';
comment on column T_LRMS_SOGAKU_KIHON.CUST_ID is '顧客ID';
comment on column T_LRMS_SOGAKU_KIHON.BUNSEKI_SB_CD is '分析種別コード';
comment on column T_LRMS_SOGAKU_KIHON.BUNSEKI_CREATE_DATE is '分析実施日';
comment on column T_LRMS_SOGAKU_KIHON.BUNSEKI_UPDATE_DATE is '分析最終更新日';
comment on column T_LRMS_SOGAKU_KIHON.BUNSEKI_COMMENT is '分析一覧コメント';
comment on column T_LRMS_SOGAKU_KIHON.SEKKEI_PLAN_NO is '設計プランNO';
comment on column T_LRMS_SOGAKU_KIHON.INSURED_ID is '被保険者ＩＤ';
comment on column T_LRMS_SOGAKU_KIHON.SPOUSE_UMU_CD is '配偶者有無コード';
comment on column T_LRMS_SOGAKU_KIHON.HTSZN_SB_CD is '法定相続人種別コード';
comment on column T_LRMS_SOGAKU_KIHON.HTSZN_CNT is '法定相続人数';
comment on column T_LRMS_SOGAKU_KIHON.SYSTEM_CREATE_DATE is 'システム作成日時';
comment on column T_LRMS_SOGAKU_KIHON.SYSTEM_UPDATE_DATE is 'システム更新日時';
