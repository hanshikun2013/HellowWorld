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
comment on table T_LRMS_CARE_HOSHO_KIHON is 'LRMS介護保障分析基本';
comment on column T_LRMS_CARE_HOSHO_KIHON.CUST_ID is '顧客ID';
comment on column T_LRMS_CARE_HOSHO_KIHON.BUNSEKI_SB_CD is '分析種別コード';
comment on column T_LRMS_CARE_HOSHO_KIHON.BUNSEKI_CREATE_DATE is '分析実施日';
comment on column T_LRMS_CARE_HOSHO_KIHON.BUNSEKI_UPDATE_DATE is '分析最終更新日';
comment on column T_LRMS_CARE_HOSHO_KIHON.BUNSEKI_COMMENT is '分析一覧コメント';
comment on column T_LRMS_CARE_HOSHO_KIHON.SEKKEI_PLAN_NO is '設計プランNO';
comment on column T_LRMS_CARE_HOSHO_KIHON.INSURED_ID is '被保険者ＩＤ';
comment on column T_LRMS_CARE_HOSHO_KIHON.CARE_TYPE_CD is '介護タイプコード';
comment on column T_LRMS_CARE_HOSHO_KIHON.ZITK_SSET_CARE_CD is '在宅/施設介護詳細コード';
comment on column T_LRMS_CARE_HOSHO_KIHON.CARE_HITSUYO_NENSU is '介護必要年数';
comment on column T_LRMS_CARE_HOSHO_KIHON.JZKGHS_ICHIJIKIN is '準備済介護保障一時金';
comment on column T_LRMS_CARE_HOSHO_KIHON.JZKGHS_NENKIN is '準備済介護保障年金';
comment on column T_LRMS_CARE_HOSHO_KIHON.JZKGHS_NENKIN_KIKAN is '準備済介護保障年金受取期間';
comment on column T_LRMS_CARE_HOSHO_KIHON.JZKGHS_KIKAN is '準備済介護保障期間';
comment on column T_LRMS_CARE_HOSHO_KIHON.JZKGHS_KIKAN_TANI_CD is '準備済介護保障期間単位コード';
comment on column T_LRMS_CARE_HOSHO_KIHON.JZKGHS_HARAIKOMIKIKAN is '準備済介護保障払込期間';
comment on column T_LRMS_CARE_HOSHO_KIHON.JZKGHS_HARAIKOMI_TANI_CD is '準備済介護保障払込期間単位コード';
comment on column T_LRMS_CARE_HOSHO_KIHON.JZKGHS_W_UMU_CD is '準備済介護保障返戻金有無コード';
comment on column T_LRMS_CARE_HOSHO_KIHON.SYSTEM_CREATE_DATE is 'システム作成日時';
comment on column T_LRMS_CARE_HOSHO_KIHON.SYSTEM_UPDATE_DATE is 'システム更新日時';
