SET ECHO OFF
SET FEEDBACK
SET HEADING 
SET PAGESIZE 0
SET TERMOUT OFF
SET TRIMSPOOL ON


--------------------------------------------------
--LNASプラン基本
--L_T_LNAS_PLAN_KIHON
SPOOL L_T_LNAS_PLAN_KIHON.csv 

SELECT 
'PLAN_ID' || ',' ||
'AGENT_ID' || ',' ||
'CUST_ID' || ',' ||
'BUNSEKI_SB_CD' || ',' ||
'CA_PLAN_ID' || ',' ||
'LEVKYI_SELECT_UMU_CD' || ',' ||
'LEVKYI_YUSEN_JUNI' || ',' ||
'LEVKYI_INPUT_UMU_CD' || ',' ||
'LEVKKN_SELECT_UMU_CD' || ',' ||
'LEVKKN_YUSEN_JUNI' || ',' ||
'LEVKKN_INPUT_UMU_CD' || ',' ||
'LEVJTK_SELECT_UMU_CD' || ',' ||
'LEVJTK_YUSEN_JUNI' || ',' ||
'LEVJTK_INPUT_UMU_CD' || ',' ||
'LEVRYK_SELECT_UMU_CD' || ',' ||
'LEVRYK_YUSEN_JUNI' || ',' ||
'LEVRYK_INPUT_UMU_CD' || ',' ||
'LEVTIK_SELECT_UMU_CD' || ',' ||
'LEVTIK_YUSEN_JUNI' || ',' ||
'LEVTIK_INPUT_UMU_CD' || ',' ||
'LEVSCL_SELECT_UMU_CD' || ',' ||
'LEVSCL_YUSEN_JUNI' || ',' ||
'LEVSCL_INPUT_UMU_CD' || ',' ||
'LEVSNT_SELECT_UMU_CD' || ',' ||
'LEVSNT_YUSEN_JUNI' || ',' ||
'LEVSNT_INPUT_UMU_CD' || ',' ||
'KEISAN_KIJUN_DATE' || ',' ||
'KEKKON_KINEN_DATE' || ',' ||
'JIKAI_UTAS_DATE' || ',' ||
'SEKKEI_PLAN_NO' || ',' ||
'SEKKEI_PLAN_P' || ',' ||
'INSURED_ID' || ',' ||
'INSURED_ID_P' || ',' ||
'SOZOKU_PLAN_NO' || ',' ||
'IRYO_PLAN_NO' || ',' ||
'CARE_PLAN_NO' || ',' ||
'SHOKEMBUNSEKI_PLAN_NO' || ',' ||
'SHOKEMBUNSEKI_PLAN_NO_P' || ',' ||
'AGENT_SEX_CD' || ',' ||
'BUNSEKI_COMMENT' || ',' ||
'BUNSEKI_CREATE_DATE' || ',' ||
'BUNSEKI_UPDATE_DATE' || ',' ||
'IKO_UMU_CD' || ',' ||
'SYSTEM_CREATE_DATE' || ',' ||
'SYSTEM_UPDATE_DATE' || ',' ||
FROM   dual;

SELECT 
PLAN_ID || ',' ||
AGENT_ID || ',' ||
CUST_ID || ',' ||
BUNSEKI_SB_CD || ',' ||
CA_PLAN_ID || ',' ||
LEVKYI_SELECT_UMU_CD || ',' ||
LEVKYI_YUSEN_JUNI || ',' ||
LEVKYI_INPUT_UMU_CD || ',' ||
LEVKKN_SELECT_UMU_CD || ',' ||
LEVKKN_YUSEN_JUNI || ',' ||
LEVKKN_INPUT_UMU_CD || ',' ||
LEVJTK_SELECT_UMU_CD || ',' ||
LEVJTK_YUSEN_JUNI || ',' ||
LEVJTK_INPUT_UMU_CD || ',' ||
LEVRYK_SELECT_UMU_CD || ',' ||
LEVRYK_YUSEN_JUNI || ',' ||
LEVRYK_INPUT_UMU_CD || ',' ||
LEVTIK_SELECT_UMU_CD || ',' ||
LEVTIK_YUSEN_JUNI || ',' ||
LEVTIK_INPUT_UMU_CD || ',' ||
LEVSCL_SELECT_UMU_CD || ',' ||
LEVSCL_YUSEN_JUNI || ',' ||
LEVSCL_INPUT_UMU_CD || ',' ||
LEVSNT_SELECT_UMU_CD || ',' ||
LEVSNT_YUSEN_JUNI || ',' ||
LEVSNT_INPUT_UMU_CD || ',' ||
KEISAN_KIJUN_DATE || ',' ||
KEKKON_KINEN_DATE || ',' ||
JIKAI_UTAS_DATE || ',' ||
SEKKEI_PLAN_NO || ',' ||
SEKKEI_PLAN_P || ',' ||
INSURED_ID || ',' ||
INSURED_ID_P || ',' ||
SOZOKU_PLAN_NO || ',' ||
IRYO_PLAN_NO || ',' ||
CARE_PLAN_NO || ',' ||
SHOKEMBUNSEKI_PLAN_NO || ',' ||
SHOKEMBUNSEKI_PLAN_NO_P || ',' ||
AGENT_SEX_CD || ',' ||
BUNSEKI_COMMENT || ',' ||
BUNSEKI_CREATE_DATE || ',' ||
BUNSEKI_UPDATE_DATE || ',' ||
IKO_UMU_CD || ',' ||
SYSTEM_CREATE_DATE || ',' ||
SYSTEM_UPDATE_DATE || ',' ||
FROM L_T_LNAS_PLAN_KIHON;

SPOOL OFF 
--------------------------------------------------

--------------------------------------------------
--LNAS話題喚起コメント設定
--L_T_LNAS_WDKK_COMMENT
SPOOL L_T_LNAS_WDKK_COMMENT.csv 

SELECT 
'PLAN_ID' || ',' ||
'WDKK_COMMENT_SB_CD' || ',' ||
'GYO_NO' || ',' ||
'SELECT_UMU_CD' || ',' ||
'SYSTEM_CREATE_DATE' || ',' ||
'SYSTEM_UPDATE_DATE' || ',' ||
FROM   dual;

SELECT 
PLAN_ID || ',' ||
WDKK_COMMENT_SB_CD || ',' ||
GYO_NO || ',' ||
SELECT_UMU_CD || ',' ||
SYSTEM_CREATE_DATE || ',' ||
SYSTEM_UPDATE_DATE || ',' ||
FROM L_T_LNAS_WDKK_COMMENT;

SPOOL OFF 
--------------------------------------------------

--------------------------------------------------
--LNAS帳票年次データ
--L_T_LNAS_RPT_NEJ_DATA
SPOOL L_T_LNAS_RPT_NEJ_DATA.csv 

SELECT 
'PLAN_ID' || ',' ||
'NEJ_DATA_KEY_CD' || ',' ||
'SEQ' || ',' ||
'LFEVT_CD' || ',' ||
'FAMILY_CD' || ',' ||
'ITEM_MEISHO' || ',' ||
'NEJ_DATA' || ',' ||
'LFEVT_ICON_TIMG_DATA' || ',' ||
'LFEVT_ICON_BAR_DATA' || ',' ||
'SYSTEM_CREATE_DATE' || ',' ||
'SYSTEM_UPDATE_DATE' || ',' ||
FROM   dual;

SELECT 
PLAN_ID || ',' ||
NEJ_DATA_KEY_CD || ',' ||
SEQ || ',' ||
LFEVT_CD || ',' ||
FAMILY_CD || ',' ||
ITEM_MEISHO || ',' ||
NEJ_DATA || ',' ||
LFEVT_ICON_TIMG_DATA || ',' ||
LFEVT_ICON_BAR_DATA || ',' ||
SYSTEM_CREATE_DATE || ',' ||
SYSTEM_UPDATE_DATE || ',' ||
FROM L_T_LNAS_RPT_NEJ_DATA;

SPOOL OFF 
--------------------------------------------------

--------------------------------------------------
--LNAS支える年次データ
--L_T_LNAS_SASAERU_NEJ_DATA
SPOOL L_T_LNAS_SASAERU_NEJ_DATA.csv 

SELECT 
'PLAN_ID' || ',' ||
'FAMILY_HONSPO_CD' || ',' ||
'NEJ_DATA_KEY_CD' || ',' ||
'SEQ' || ',' ||
'LFEVT_CD' || ',' ||
'FAMILY_CD' || ',' ||
'ITEM_MEISHO' || ',' ||
'NEJ_DATA' || ',' ||
'LFEVT_ICON_TIMG_DATA' || ',' ||
'LFEVT_ICON_BAR_DATA' || ',' ||
'SYSTEM_CREATE_DATE' || ',' ||
'SYSTEM_UPDATE_DATE' || ',' ||
FROM   dual;

SELECT 
PLAN_ID || ',' ||
FAMILY_HONSPO_CD || ',' ||
NEJ_DATA_KEY_CD || ',' ||
SEQ || ',' ||
LFEVT_CD || ',' ||
FAMILY_CD || ',' ||
ITEM_MEISHO || ',' ||
NEJ_DATA || ',' ||
LFEVT_ICON_TIMG_DATA || ',' ||
LFEVT_ICON_BAR_DATA || ',' ||
SYSTEM_CREATE_DATE || ',' ||
SYSTEM_UPDATE_DATE || ',' ||
FROM L_T_LNAS_SASAERU_NEJ_DATA;

SPOOL OFF 
--------------------------------------------------

--------------------------------------------------
--LNASヒアリングノート
--L_T_LNAS_HNOTE
SPOOL L_T_LNAS_HNOTE.csv 

SELECT 
'PLAN_ID' || ',' ||
'HNOTE_SETTEI_SB_CD' || ',' ||
'HNOTE_COMMENT' || ',' ||
'SYSTEM_CREATE_DATE' || ',' ||
'SYSTEM_UPDATE_DATE' || ',' ||
FROM   dual;

SELECT 
PLAN_ID || ',' ||
HNOTE_SETTEI_SB_CD || ',' ||
HNOTE_COMMENT || ',' ||
SYSTEM_CREATE_DATE || ',' ||
SYSTEM_UPDATE_DATE || ',' ||
FROM L_T_LNAS_HNOTE;

SPOOL OFF 
--------------------------------------------------

--------------------------------------------------
--LNAS紹介依頼
--L_T_LNAS_SHOKAI_IRAI
SPOOL L_T_LNAS_SHOKAI_IRAI.csv 

SELECT 
'PLAN_ID' || ',' ||
'SEQ' || ',' ||
'SHOKAISYA_NAME' || ',' ||
'SHOKAISYA_RELATION' || ',' ||
'SHOKAISYA_TEL_NO' || ',' ||
'NOTES' || ',' ||
'SYSTEM_CREATE_DATE' || ',' ||
'SYSTEM_UPDATE_DATE' || ',' ||
FROM   dual;

SELECT 
PLAN_ID || ',' ||
SEQ || ',' ||
SHOKAISYA_NAME || ',' ||
SHOKAISYA_RELATION || ',' ||
SHOKAISYA_TEL_NO || ',' ||
NOTES || ',' ||
SYSTEM_CREATE_DATE || ',' ||
SYSTEM_UPDATE_DATE || ',' ||
FROM L_T_LNAS_SHOKAI_IRAI;

SPOOL OFF 
--------------------------------------------------

--------------------------------------------------
--LNASプラン家族
--L_T_LNAS_PFAMLY
SPOOL L_T_LNAS_PFAMLY.csv 

SELECT 
'PLAN_ID' || ',' ||
'FAMILY_CD' || ',' ||
'FAMILY_NAME_KANJI' || ',' ||
'FAMILY_NAME_KANA' || ',' ||
'BIRTH' || ',' ||
'AGE' || ',' ||
'BIRTH_AGE_SELECT_CD' || ',' ||
'ZOKUGARA_CD' || ',' ||
'SEX_CD' || ',' ||
'JOB_CD' || ',' ||
'NENSHU' || ',' ||
'TAISHOKU_PLAN_AGE' || ',' ||
'HEIKIN_YOMEI' || ',' ||
'IMEJI_GAZOU_CD' || ',' ||
'SYSTEM_CREATE_DATE' || ',' ||
'SYSTEM_UPDATE_DATE' || ',' ||
FROM   dual;

SELECT 
PLAN_ID || ',' ||
FAMILY_CD || ',' ||
FAMILY_NAME_KANJI || ',' ||
FAMILY_NAME_KANA || ',' ||
BIRTH || ',' ||
AGE || ',' ||
BIRTH_AGE_SELECT_CD || ',' ||
ZOKUGARA_CD || ',' ||
SEX_CD || ',' ||
JOB_CD || ',' ||
NENSHU || ',' ||
TAISHOKU_PLAN_AGE || ',' ||
HEIKIN_YOMEI || ',' ||
IMEJI_GAZOU_CD || ',' ||
SYSTEM_CREATE_DATE || ',' ||
SYSTEM_UPDATE_DATE || ',' ||
FROM L_T_LNAS_PFAMLY;

SPOOL OFF 
--------------------------------------------------

--------------------------------------------------
--LNASライフデザイン教育資金
--L_T_LNAS_LEVKYI_SHIKIN
SPOOL L_T_LNAS_LEVKYI_SHIKIN.csv 

SELECT 
'PLAN_ID' || ',' ||
'FAMILY_CHILD_CD' || ',' ||
'YOCHIEN_SB_CD' || ',' ||
'SHOGAKKO_SB_CD' || ',' ||
'CHUGAKKO_SB_CD' || ',' ||
'KOKO_SB_CD' || ',' ||
'DAIGAKU_SB_CD' || ',' ||
'EDUC_SHIKIN_NOTES' || ',' ||
'EDUC_SHIKIN_GOKEIGAKU' || ',' ||
'SYSTEM_CREATE_DATE' || ',' ||
'SYSTEM_UPDATE_DATE' || ',' ||
FROM   dual;

SELECT 
PLAN_ID || ',' ||
FAMILY_CHILD_CD || ',' ||
YOCHIEN_SB_CD || ',' ||
SHOGAKKO_SB_CD || ',' ||
CHUGAKKO_SB_CD || ',' ||
KOKO_SB_CD || ',' ||
DAIGAKU_SB_CD || ',' ||
EDUC_SHIKIN_NOTES || ',' ||
EDUC_SHIKIN_GOKEIGAKU || ',' ||
SYSTEM_CREATE_DATE || ',' ||
SYSTEM_UPDATE_DATE || ',' ||
FROM L_T_LNAS_LEVKYI_SHIKIN;

SPOOL OFF 
--------------------------------------------------

--------------------------------------------------
--LNASライフデザイン結婚資金
--L_T_LNAS_LEVKKN_SHIKIN
SPOOL L_T_LNAS_LEVKKN_SHIKIN.csv 

SELECT 
'PLAN_ID' || ',' ||
'FAMILY_CHILD_CD' || ',' ||
'KEKKON_AGE' || ',' ||
'KEKKON_ENJO_SHIKIN' || ',' ||
'SYSTEM_CREATE_DATE' || ',' ||
'SYSTEM_UPDATE_DATE' || ',' ||
FROM   dual;

SELECT 
PLAN_ID || ',' ||
FAMILY_CHILD_CD || ',' ||
KEKKON_AGE || ',' ||
KEKKON_ENJO_SHIKIN || ',' ||
SYSTEM_CREATE_DATE || ',' ||
SYSTEM_UPDATE_DATE || ',' ||
FROM L_T_LNAS_LEVKKN_SHIKIN;

SPOOL OFF 
--------------------------------------------------

--------------------------------------------------
--LNASライフデザイン住宅資金
--L_T_LNAS_LEVJTK_SHIKIN
SPOOL L_T_LNAS_LEVJTK_SHIKIN.csv 

SELECT 
'PLAN_ID' || ',' ||
'GENZAI_JUKYO_TNTI_FLG' || ',' ||
'GENZAI_JUKYO_MTIE_FLG' || ',' ||
'SYORAI_JUKYO_CD' || ',' ||
'JUTAKU_KONYU_JIKI' || ',' ||
'JUTAKU_KONYU_CHIKI_CD' || ',' ||
'JUTAKU_KONYU_PLACE' || ',' ||
'JUTAKU_SB_CD' || ',' ||
'NEWOLD_CD' || ',' ||
'REFORM_COMMENT' || ',' ||
'GENZAI_YACHIN' || ',' ||
'GENZAI_JLOAN_NENGAKU' || ',' ||
'GENZAI_JLOAN_END' || ',' ||
'GENZAI_JLOAN_NENSAI_CD' || ',' ||
'GENZAI_JLOAN_YRHNSG' || ',' ||
'DANSHIN_KANYU_CD' || ',' ||
'SYORAI_KONYU_KAKAKU' || ',' ||
'SYORAI_KONYU_SHOKEIHI' || ',' ||
'SYORAI_KONYU_KYOEKIHI' || ',' ||
'GENZAI_JLOAN_JKSIKN' || ',' ||
'SYORAI_JLOAN_YRHNSG' || ',' ||
'SYSTEM_CREATE_DATE' || ',' ||
'SYSTEM_UPDATE_DATE' || ',' ||
FROM   dual;

SELECT 
PLAN_ID || ',' ||
GENZAI_JUKYO_TNTI_FLG || ',' ||
GENZAI_JUKYO_MTIE_FLG || ',' ||
SYORAI_JUKYO_CD || ',' ||
JUTAKU_KONYU_JIKI || ',' ||
JUTAKU_KONYU_CHIKI_CD || ',' ||
JUTAKU_KONYU_PLACE || ',' ||
JUTAKU_SB_CD || ',' ||
NEWOLD_CD || ',' ||
REFORM_COMMENT || ',' ||
GENZAI_YACHIN || ',' ||
GENZAI_JLOAN_NENGAKU || ',' ||
GENZAI_JLOAN_END || ',' ||
GENZAI_JLOAN_NENSAI_CD || ',' ||
GENZAI_JLOAN_YRHNSG || ',' ||
DANSHIN_KANYU_CD || ',' ||
SYORAI_KONYU_KAKAKU || ',' ||
SYORAI_KONYU_SHOKEIHI || ',' ||
SYORAI_KONYU_KYOEKIHI || ',' ||
GENZAI_JLOAN_JKSIKN || ',' ||
SYORAI_JLOAN_YRHNSG || ',' ||
SYSTEM_CREATE_DATE || ',' ||
SYSTEM_UPDATE_DATE || ',' ||
FROM L_T_LNAS_LEVJTK_SHIKIN;

SPOOL OFF 
--------------------------------------------------

--------------------------------------------------
--LNASライフデザイン住宅ローン設定
--L_T_LNAS_LEVJTK_JLOAN
SPOOL L_T_LNAS_LEVJTK_JLOAN.csv 

SELECT 
'PLAN_ID' || ',' ||
'GENZAI_SYORAI_KB' || ',' ||
'SEQ' || ',' ||
'LOAN_MEISHO' || ',' ||
'KARIRE_KINGAKU' || ',' ||
'HENSAI_KIKAN' || ',' ||
'TOSYO_KINRI' || ',' ||
'KINRI_APPLY_KIKAN' || ',' ||
'APPLY_END_KINRI' || ',' ||
'HENSAI_HOSHIKI_CD' || ',' ||
'DANSHIN_KANYU_CD' || ',' ||
'NENKAN_HENSAIGAKU' || ',' ||
'KURIHEN_JIKI' || ',' ||
'KURIHEN_NENSAI_CD' || ',' ||
'KURIHEN_KINGAKU' || ',' ||
'KURIHEN_HOSHIKI_CD' || ',' ||
'SYSTEM_CREATE_DATE' || ',' ||
'SYSTEM_UPDATE_DATE' || ',' ||
FROM   dual;

SELECT 
PLAN_ID || ',' ||
GENZAI_SYORAI_KB || ',' ||
SEQ || ',' ||
LOAN_MEISHO || ',' ||
KARIRE_KINGAKU || ',' ||
HENSAI_KIKAN || ',' ||
TOSYO_KINRI || ',' ||
KINRI_APPLY_KIKAN || ',' ||
APPLY_END_KINRI || ',' ||
HENSAI_HOSHIKI_CD || ',' ||
DANSHIN_KANYU_CD || ',' ||
NENKAN_HENSAIGAKU || ',' ||
KURIHEN_JIKI || ',' ||
KURIHEN_NENSAI_CD || ',' ||
KURIHEN_KINGAKU || ',' ||
KURIHEN_HOSHIKI_CD || ',' ||
SYSTEM_CREATE_DATE || ',' ||
SYSTEM_UPDATE_DATE || ',' ||
FROM L_T_LNAS_LEVJTK_JLOAN;

SPOOL OFF 
--------------------------------------------------

--------------------------------------------------
--LNASライフデザイン住宅ローン借換
--L_T_LNAS_LEVJTK_JLOAN_KKAE
SPOOL L_T_LNAS_LEVJTK_JLOAN_KKAE.csv 

SELECT 
'PLAN_ID' || ',' ||
'KKAE_JIKI' || ',' ||
'KKAE_NENSAI_CD' || ',' ||
'HENSAI_KIKAN' || ',' ||
'TOSYO_KINRI' || ',' ||
'KINRI_APPLY_KIKAN' || ',' ||
'APPLY_END_KINRI' || ',' ||
'HENSAI_HOSHIKI_CD' || ',' ||
'DANSHIN_KANYU_CD' || ',' ||
'NENKAN_HENSAIGAKU' || ',' ||
'SYSTEM_CREATE_DATE' || ',' ||
'SYSTEM_UPDATE_DATE' || ',' ||
FROM   dual;

SELECT 
PLAN_ID || ',' ||
KKAE_JIKI || ',' ||
KKAE_NENSAI_CD || ',' ||
HENSAI_KIKAN || ',' ||
TOSYO_KINRI || ',' ||
KINRI_APPLY_KIKAN || ',' ||
APPLY_END_KINRI || ',' ||
HENSAI_HOSHIKI_CD || ',' ||
DANSHIN_KANYU_CD || ',' ||
NENKAN_HENSAIGAKU || ',' ||
SYSTEM_CREATE_DATE || ',' ||
SYSTEM_UPDATE_DATE || ',' ||
FROM L_T_LNAS_LEVJTK_JLOAN_KKAE;

SPOOL OFF 
--------------------------------------------------

--------------------------------------------------
--LNASライフデザイン住宅ローン償還
--L_T_LNAS_LEVJTK_JLOAN_SYKN
SPOOL L_T_LNAS_LEVJTK_JLOAN_SYKN.csv 

SELECT 
'PLAN_ID' || ',' ||
'LOAN_HENSAI_CT' || ',' ||
'LOAN_HENSAI_GAKU' || ',' ||
'LOAN_GNKN' || ',' ||
'LOAN_RISOKU' || ',' ||
'LOAN_KARIRE_ZANDAKA' || ',' ||
'SYSTEM_CREATE_DATE' || ',' ||
'SYSTEM_UPDATE_DATE' || ',' ||
FROM   dual;

SELECT 
PLAN_ID || ',' ||
LOAN_HENSAI_CT || ',' ||
LOAN_HENSAI_GAKU || ',' ||
LOAN_GNKN || ',' ||
LOAN_RISOKU || ',' ||
LOAN_KARIRE_ZANDAKA || ',' ||
SYSTEM_CREATE_DATE || ',' ||
SYSTEM_UPDATE_DATE || ',' ||
FROM L_T_LNAS_LEVJTK_JLOAN_SYKN;

SPOOL OFF 
--------------------------------------------------

--------------------------------------------------
--LNASライフデザイン旅行資金
--L_T_LNAS_LEVRYK_SHIKIN
SPOOL L_T_LNAS_LEVRYK_SHIKIN.csv 

SELECT 
'PLAN_ID' || ',' ||
'SEQ' || ',' ||
'RYOKO_CD' || ',' ||
'RYOKO_NAME' || ',' ||
'RYOKO_START_JIKI' || ',' ||
'RYOKO_START_NENSAI_CD' || ',' ||
'RYOKO_END_JIKI' || ',' ||
'RYOKO_END_NENSAI_CD' || ',' ||
'RYOKO_SYUKI_YEAR' || ',' ||
'RYOKO_KINGAKU' || ',' ||
'SYSTEM_CREATE_DATE' || ',' ||
'SYSTEM_UPDATE_DATE' || ',' ||
FROM   dual;

SELECT 
PLAN_ID || ',' ||
SEQ || ',' ||
RYOKO_CD || ',' ||
RYOKO_NAME || ',' ||
RYOKO_START_JIKI || ',' ||
RYOKO_START_NENSAI_CD || ',' ||
RYOKO_END_JIKI || ',' ||
RYOKO_END_NENSAI_CD || ',' ||
RYOKO_SYUKI_YEAR || ',' ||
RYOKO_KINGAKU || ',' ||
SYSTEM_CREATE_DATE || ',' ||
SYSTEM_UPDATE_DATE || ',' ||
FROM L_T_LNAS_LEVRYK_SHIKIN;

SPOOL OFF 
--------------------------------------------------

--------------------------------------------------
--LNASライフデザイン耐久財資金
--L_T_LNAS_LEVTIK_SHIKIN
SPOOL L_T_LNAS_LEVTIK_SHIKIN.csv 

SELECT 
'PLAN_ID' || ',' ||
'SEQ' || ',' ||
'KONYU_NAME' || ',' ||
'KONYU_START_JIKI' || ',' ||
'KONYU_START_NENSAI_CD' || ',' ||
'KONYU_END_JIKI' || ',' ||
'KONYU_END_NENSAI_CD' || ',' ||
'KONYU_SYUKI_YEAR' || ',' ||
'KONYU_KINGAKU' || ',' ||
'SYORAI_LOAN_UMU_CD' || ',' ||
'KARIRE_KINGAKU' || ',' ||
'LOAN_KIKAN' || ',' ||
'KARIRE_RI_RT' || ',' ||
'KONYU_CT' || ',' ||
'LOAN_APPLY_CT' || ',' ||
'SYSTEM_CREATE_DATE' || ',' ||
'SYSTEM_UPDATE_DATE' || ',' ||
FROM   dual;

SELECT 
PLAN_ID || ',' ||
SEQ || ',' ||
KONYU_NAME || ',' ||
KONYU_START_JIKI || ',' ||
KONYU_START_NENSAI_CD || ',' ||
KONYU_END_JIKI || ',' ||
KONYU_END_NENSAI_CD || ',' ||
KONYU_SYUKI_YEAR || ',' ||
KONYU_KINGAKU || ',' ||
SYORAI_LOAN_UMU_CD || ',' ||
KARIRE_KINGAKU || ',' ||
LOAN_KIKAN || ',' ||
KARIRE_RI_RT || ',' ||
KONYU_CT || ',' ||
LOAN_APPLY_CT || ',' ||
SYSTEM_CREATE_DATE || ',' ||
SYSTEM_UPDATE_DATE || ',' ||
FROM L_T_LNAS_LEVTIK_SHIKIN;

SPOOL OFF 
--------------------------------------------------

--------------------------------------------------
--LNASライフデザイン耐久財現在ローン設定
--L_T_LNAS_LEVTIK_LOAN
SPOOL L_T_LNAS_LEVTIK_LOAN.csv 

SELECT 
'PLAN_ID' || ',' ||
'SEQ' || ',' ||
'LOAN_MEISHO' || ',' ||
'LOAN_PAY_KINGAKU' || ',' ||
'LOAN_END_JIKI' || ',' ||
'LOAN_END_NENSAI_CD' || ',' ||
'KARIRE_RI_RT' || ',' ||
'SYSTEM_CREATE_DATE' || ',' ||
'SYSTEM_UPDATE_DATE' || ',' ||
FROM   dual;

SELECT 
PLAN_ID || ',' ||
SEQ || ',' ||
LOAN_MEISHO || ',' ||
LOAN_PAY_KINGAKU || ',' ||
LOAN_END_JIKI || ',' ||
LOAN_END_NENSAI_CD || ',' ||
KARIRE_RI_RT || ',' ||
SYSTEM_CREATE_DATE || ',' ||
SYSTEM_UPDATE_DATE || ',' ||
FROM L_T_LNAS_LEVTIK_LOAN;

SPOOL OFF 
--------------------------------------------------

--------------------------------------------------
--LNASライフデザインセカンドライフ資金
--L_T_LNAS_LEVSCL_SHIKIN
SPOOL L_T_LNAS_LEVSCL_SHIKIN.csv 

SELECT 
'PLAN_ID' || ',' ||
'SECLIFHI' || ',' ||
'SYSTEM_CREATE_DATE' || ',' ||
'SYSTEM_UPDATE_DATE' || ',' ||
FROM   dual;

SELECT 
PLAN_ID || ',' ||
SECLIFHI || ',' ||
SYSTEM_CREATE_DATE || ',' ||
SYSTEM_UPDATE_DATE || ',' ||
FROM L_T_LNAS_LEVSCL_SHIKIN;

SPOOL OFF 
--------------------------------------------------

--------------------------------------------------
--LNASライフデザインキャリアデザイン
--L_T_LNAS_LEVSCL_CRRDSIN
SPOOL L_T_LNAS_LEVSCL_CRRDSIN.csv 

SELECT 
'PLAN_ID' || ',' ||
'FAMILY_HONSPO_CD' || ',' ||
'JOB1_NAME' || ',' ||
'JOB1_START_JIKI' || ',' ||
'JOB1_START_NENSAI_CD' || ',' ||
'JOB1_END_JIKI' || ',' ||
'JOB1_END_NENSAI_CD' || ',' ||
'JOB2_NAME' || ',' ||
'JOB2_START_JIKI' || ',' ||
'JOB2_START_NENSAI_CD' || ',' ||
'JOB2_END_JIKI' || ',' ||
'JOB2_END_NENSAI_CD' || ',' ||
'JOB3_NAME' || ',' ||
'JOB3_START_JIKI' || ',' ||
'JOB3_START_NENSAI_CD' || ',' ||
'JOB3_END_JIKI' || ',' ||
'JOB3_END_NENSAI_CD' || ',' ||
'TEINEN_TAISHOKU_AGE' || ',' ||
'SECONDLIFE_START_AGE' || ',' ||
'SYSTEM_CREATE_DATE' || ',' ||
'SYSTEM_UPDATE_DATE' || ',' ||
FROM   dual;

SELECT 
PLAN_ID || ',' ||
FAMILY_HONSPO_CD || ',' ||
JOB1_NAME || ',' ||
JOB1_START_JIKI || ',' ||
JOB1_START_NENSAI_CD || ',' ||
JOB1_END_JIKI || ',' ||
JOB1_END_NENSAI_CD || ',' ||
JOB2_NAME || ',' ||
JOB2_START_JIKI || ',' ||
JOB2_START_NENSAI_CD || ',' ||
JOB2_END_JIKI || ',' ||
JOB2_END_NENSAI_CD || ',' ||
JOB3_NAME || ',' ||
JOB3_START_JIKI || ',' ||
JOB3_START_NENSAI_CD || ',' ||
JOB3_END_JIKI || ',' ||
JOB3_END_NENSAI_CD || ',' ||
TEINEN_TAISHOKU_AGE || ',' ||
SECONDLIFE_START_AGE || ',' ||
SYSTEM_CREATE_DATE || ',' ||
SYSTEM_UPDATE_DATE || ',' ||
FROM L_T_LNAS_LEVSCL_CRRDSIN;

SPOOL OFF 
--------------------------------------------------

--------------------------------------------------
--LNASライフデザインセカンドライフ実現したいこと
--L_T_LNAS_LEVSCL_JTGN
SPOOL L_T_LNAS_LEVSCL_JTGN.csv 

SELECT 
'PLAN_ID' || ',' ||
'SEQ' || ',' ||
'JTGN_MEISHO' || ',' ||
'JTGN_START_JIKI' || ',' ||
'JTGN_START_NENSAI_CD' || ',' ||
'JTGN_END_JIKI' || ',' ||
'JTGN_END_NENSAI_CD' || ',' ||
'JTGN_SYUKI_YEAR' || ',' ||
'JTGN_KINGAKU' || ',' ||
'SYSTEM_CREATE_DATE' || ',' ||
'SYSTEM_UPDATE_DATE' || ',' ||
FROM   dual;

SELECT 
PLAN_ID || ',' ||
SEQ || ',' ||
JTGN_MEISHO || ',' ||
JTGN_START_JIKI || ',' ||
JTGN_START_NENSAI_CD || ',' ||
JTGN_END_JIKI || ',' ||
JTGN_END_NENSAI_CD || ',' ||
JTGN_SYUKI_YEAR || ',' ||
JTGN_KINGAKU || ',' ||
SYSTEM_CREATE_DATE || ',' ||
SYSTEM_UPDATE_DATE || ',' ||
FROM L_T_LNAS_LEVSCL_JTGN;

SPOOL OFF 
--------------------------------------------------

--------------------------------------------------
--LNASライフデザインセカンドライフ生活費
--L_T_LNAS_LEVSCL_SEIKATSUHI
SPOOL L_T_LNAS_LEVSCL_SEIKATSUHI.csv 

SELECT 
'PLAN_ID' || ',' ||
'SEQ' || ',' ||
'SEIKATSUHI_ITEM_CD' || ',' ||
'SEIKATSUHI_ITEM_NAME' || ',' ||
'SEIKATSUHI_ITEM_KINGAKU' || ',' ||
'SYSTEM_CREATE_DATE' || ',' ||
'SYSTEM_UPDATE_DATE' || ',' ||
FROM   dual;

SELECT 
PLAN_ID || ',' ||
SEQ || ',' ||
SEIKATSUHI_ITEM_CD || ',' ||
SEIKATSUHI_ITEM_NAME || ',' ||
SEIKATSUHI_ITEM_KINGAKU || ',' ||
SYSTEM_CREATE_DATE || ',' ||
SYSTEM_UPDATE_DATE || ',' ||
FROM L_T_LNAS_LEVSCL_SEIKATSUHI;

SPOOL OFF 
--------------------------------------------------

--------------------------------------------------
--LNASライフデザインその他資金
--L_T_LNAS_LEVSNT_SHIKIN
SPOOL L_T_LNAS_LEVSNT_SHIKIN.csv 

SELECT 
'PLAN_ID' || ',' ||
'SEQ' || ',' ||
'TAKIKK_MEISHO' || ',' ||
'TAKIKK_START_JIKI' || ',' ||
'TAKIKK_START' || ',' ||
'TAKIKK_END_JIKI' || ',' ||
'TAKIKK_END' || ',' ||
'TAKIKK_SYUKI' || ',' ||
'TAKIKK_KINGAKU' || ',' ||
'SYSTEM_CREATE_DATE' || ',' ||
'SYSTEM_UPDATE_DATE' || ',' ||
FROM   dual;

SELECT 
PLAN_ID || ',' ||
SEQ || ',' ||
TAKIKK_MEISHO || ',' ||
TAKIKK_START_JIKI || ',' ||
TAKIKK_START || ',' ||
TAKIKK_END_JIKI || ',' ||
TAKIKK_END || ',' ||
TAKIKK_SYUKI || ',' ||
TAKIKK_KINGAKU || ',' ||
SYSTEM_CREATE_DATE || ',' ||
SYSTEM_UPDATE_DATE || ',' ||
FROM L_T_LNAS_LEVSNT_SHIKIN;

SPOOL OFF 
--------------------------------------------------

--------------------------------------------------
--LNAS準備済国
--L_T_LNAS_JBKUNI
SPOOL L_T_LNAS_JBKUNI.csv 

SELECT 
'PLAN_ID' || ',' ||
'FAMILY_HONSPO_CD' || ',' ||
'NENKIN_SHURUI_CD' || ',' ||
'NENSHU' || ',' ||
'TEDORI_NENSHU' || ',' ||
'SYSTEM_CREATE_DATE' || ',' ||
'SYSTEM_UPDATE_DATE' || ',' ||
FROM   dual;

SELECT 
PLAN_ID || ',' ||
FAMILY_HONSPO_CD || ',' ||
NENKIN_SHURUI_CD || ',' ||
NENSHU || ',' ||
TEDORI_NENSHU || ',' ||
SYSTEM_CREATE_DATE || ',' ||
SYSTEM_UPDATE_DATE || ',' ||
FROM L_T_LNAS_JBKUNI;

SPOOL OFF 
--------------------------------------------------

--------------------------------------------------
--LNAS準備済国老齢年金
--L_T_LNAS_JBKUNI_CP
SPOOL L_T_LNAS_JBKUNI_CP.csv 

SELECT 
'PLAN_ID' || ',' ||
'FAMILY_HONSPO_CD' || ',' ||
'AE_EP_GETSUGAKU' || ',' ||
'AE_EP_GAKU' || ',' ||
'AE_MP_GETSUGAKU' || ',' ||
'AE_MP_GAKU' || ',' ||
'SYSTEM_CREATE_DATE' || ',' ||
'SYSTEM_UPDATE_DATE' || ',' ||
FROM   dual;

SELECT 
PLAN_ID || ',' ||
FAMILY_HONSPO_CD || ',' ||
AE_EP_GETSUGAKU || ',' ||
AE_EP_GAKU || ',' ||
AE_MP_GETSUGAKU || ',' ||
AE_MP_GAKU || ',' ||
SYSTEM_CREATE_DATE || ',' ||
SYSTEM_UPDATE_DATE || ',' ||
FROM L_T_LNAS_JBKUNI_CP;

SPOOL OFF 
--------------------------------------------------

--------------------------------------------------
--LNAS準備済国遺族年金
--L_T_LNAS_JBKUNI_IZOKU
SPOOL L_T_LNAS_JBKUNI_IZOKU.csv 

SELECT 
'PLAN_ID' || ',' ||
'FAMILY_HONSPO_CD' || ',' ||
'HAP_AGE' || ',' ||
'AE_EP_GETSUGAKU' || ',' ||
'AE_EP_GAKU' || ',' ||
'AE_MP_GETSUGAKU' || ',' ||
'AE_MP_GAKU' || ',' ||
'SYSTEM_CREATE_DATE' || ',' ||
'SYSTEM_UPDATE_DATE' || ',' ||
FROM   dual;

SELECT 
PLAN_ID || ',' ||
FAMILY_HONSPO_CD || ',' ||
HAP_AGE || ',' ||
AE_EP_GETSUGAKU || ',' ||
AE_EP_GAKU || ',' ||
AE_MP_GETSUGAKU || ',' ||
AE_MP_GAKU || ',' ||
SYSTEM_CREATE_DATE || ',' ||
SYSTEM_UPDATE_DATE || ',' ||
FROM L_T_LNAS_JBKUNI_IZOKU;

SPOOL OFF 
--------------------------------------------------

--------------------------------------------------
--LNAS準備済国公的年金詳細
--L_T_LNAS_JBKUNI_CP_DET
SPOOL L_T_LNAS_JBKUNI_CP_DET.csv 

SELECT 
'PLAN_ID' || ',' ||
'FAMILY_HONSPO_CD' || ',' ||
'SEQ' || ',' ||
'NENKIN_SHURUI_CD' || ',' ||
'NENKIN_START_NENGETSU' || ',' ||
'NENKIN_END_NENGETSU' || ',' ||
'NENSHU' || ',' ||
'SYSTEM_CREATE_DATE' || ',' ||
'SYSTEM_UPDATE_DATE' || ',' ||
FROM   dual;

SELECT 
PLAN_ID || ',' ||
FAMILY_HONSPO_CD || ',' ||
SEQ || ',' ||
NENKIN_SHURUI_CD || ',' ||
NENKIN_START_NENGETSU || ',' ||
NENKIN_END_NENGETSU || ',' ||
NENSHU || ',' ||
SYSTEM_CREATE_DATE || ',' ||
SYSTEM_UPDATE_DATE || ',' ||
FROM L_T_LNAS_JBKUNI_CP_DET;

SPOOL OFF 
--------------------------------------------------

--------------------------------------------------
--LNAS準備済会社
--L_T_LNAS_JBCORP
SPOOL L_T_LNAS_JBCORP.csv 

SELECT 
'PLAN_ID' || ',' ||
'FAMILY_HONSPO_CD' || ',' ||
'TEINEN_TAISHOKUKIN' || ',' ||
'SHIBO_TAISHOKUKIN' || ',' ||
'TISNKN_START_JIKI' || ',' ||
'TISNKN_START' || ',' ||
'TISNKN_END_JIKI' || ',' ||
'TISNKN_END' || ',' ||
'TISNKN_KINGAKU' || ',' ||
'SYSTEM_CREATE_DATE' || ',' ||
'SYSTEM_UPDATE_DATE' || ',' ||
FROM   dual;

SELECT 
PLAN_ID || ',' ||
FAMILY_HONSPO_CD || ',' ||
TEINEN_TAISHOKUKIN || ',' ||
SHIBO_TAISHOKUKIN || ',' ||
TISNKN_START_JIKI || ',' ||
TISNKN_START || ',' ||
TISNKN_END_JIKI || ',' ||
TISNKN_END || ',' ||
TISNKN_KINGAKU || ',' ||
SYSTEM_CREATE_DATE || ',' ||
SYSTEM_UPDATE_DATE || ',' ||
FROM L_T_LNAS_JBCORP;

SPOOL OFF 
--------------------------------------------------

--------------------------------------------------
--LNAS準備済個人
--L_T_LNAS_JBKOJI
SPOOL L_T_LNAS_JBKOJI.csv 

SELECT 
'PLAN_ID' || ',' ||
'YOCHOKIN_ZANDAKA' || ',' ||
'ZAN_KINGAKU' || ',' ||
'TSUMITATEGAKU_MAITSUKI' || ',' ||
'TSUMITATEGAKU_BNS1' || ',' ||
'TSUMITATEGAKU_BNS2' || ',' ||
'TSUMITATEGAKU_OTHER' || ',' ||
'TSUMITATEGAKU_GOKEI' || ',' ||
'ZISN_FUDOSAN' || ',' ||
'ZISN_YKSK' || ',' ||
'ZISN_OTHER' || ',' ||
'DEBT_KARIREKIN' || ',' ||
'FDSN_START_JIKI' || ',' ||
'FDSN_START_NENSAI_CD' || ',' ||
'FDSN_END_JIKI' || ',' ||
'FDSN_END_NENSAI_CD' || ',' ||
'FDSN_KINGAKU' || ',' ||
'HTSN_START_JIKI' || ',' ||
'HTSN_START_NENSAI_CD' || ',' ||
'HTSN_END_JIKI' || ',' ||
'HTSN_END_NENSAI_CD' || ',' ||
'HTSN_KINGAKU' || ',' ||
'TASN_START_JIKI' || ',' ||
'TASN_START_NENSAI_CD' || ',' ||
'TASN_END_JIKI' || ',' ||
'TASN_END_NENSAI_CD' || ',' ||
'TASN_KINGAKU' || ',' ||
'NSYSYT_GAKU' || ',' ||
'SYSTEM_CREATE_DATE' || ',' ||
'SYSTEM_UPDATE_DATE' || ',' ||
FROM   dual;

SELECT 
PLAN_ID || ',' ||
YOCHOKIN_ZANDAKA || ',' ||
ZAN_KINGAKU || ',' ||
TSUMITATEGAKU_MAITSUKI || ',' ||
TSUMITATEGAKU_BNS1 || ',' ||
TSUMITATEGAKU_BNS2 || ',' ||
TSUMITATEGAKU_OTHER || ',' ||
TSUMITATEGAKU_GOKEI || ',' ||
ZISN_FUDOSAN || ',' ||
ZISN_YKSK || ',' ||
ZISN_OTHER || ',' ||
DEBT_KARIREKIN || ',' ||
FDSN_START_JIKI || ',' ||
FDSN_START_NENSAI_CD || ',' ||
FDSN_END_JIKI || ',' ||
FDSN_END_NENSAI_CD || ',' ||
FDSN_KINGAKU || ',' ||
HTSN_START_JIKI || ',' ||
HTSN_START_NENSAI_CD || ',' ||
HTSN_END_JIKI || ',' ||
HTSN_END_NENSAI_CD || ',' ||
HTSN_KINGAKU || ',' ||
TASN_START_JIKI || ',' ||
TASN_START_NENSAI_CD || ',' ||
TASN_END_JIKI || ',' ||
TASN_END_NENSAI_CD || ',' ||
TASN_KINGAKU || ',' ||
NSYSYT_GAKU || ',' ||
SYSTEM_CREATE_DATE || ',' ||
SYSTEM_UPDATE_DATE || ',' ||
FROM L_T_LNAS_JBKOJI;

SPOOL OFF 
--------------------------------------------------

--------------------------------------------------
--LNAS準備済個人将来預貯金詳細
--L_T_LNAS_JBKOJI_SCHKN_DET
SPOOL L_T_LNAS_JBKOJI_SCHKN_DET.csv 

SELECT 
'PLAN_ID' || ',' ||
'SEQ' || ',' ||
'CHOCHIKU_SHURUI_CD' || ',' ||
'YOCHOKIN_MOKUTEKI' || ',' ||
'YOCHOKIN_START_JIKI' || ',' ||
'YOCHOKIN_START_NENSAI' || ',' ||
'YOCHOKIN_END_JIKI' || ',' ||
'YOCHOKIN_END_NENSAI' || ',' ||
'NENKAN_TSUMITATEGAKU' || ',' ||
'YOCHOKIN_MKHYO' || ',' ||
'YOCHOKIN_COMMENT' || ',' ||
'SYSTEM_CREATE_DATE' || ',' ||
'SYSTEM_UPDATE_DATE' || ',' ||
FROM   dual;

SELECT 
PLAN_ID || ',' ||
SEQ || ',' ||
CHOCHIKU_SHURUI_CD || ',' ||
YOCHOKIN_MOKUTEKI || ',' ||
YOCHOKIN_START_JIKI || ',' ||
YOCHOKIN_START_NENSAI || ',' ||
YOCHOKIN_END_JIKI || ',' ||
YOCHOKIN_END_NENSAI || ',' ||
NENKAN_TSUMITATEGAKU || ',' ||
YOCHOKIN_MKHYO || ',' ||
YOCHOKIN_COMMENT || ',' ||
SYSTEM_CREATE_DATE || ',' ||
SYSTEM_UPDATE_DATE || ',' ||
FROM L_T_LNAS_JBKOJI_SCHKN_DET;

SPOOL OFF 
--------------------------------------------------

--------------------------------------------------
--LNAS準備済個人現在預貯金詳細
--L_T_LNAS_JBKOJI_GCHKN_DET
SPOOL L_T_LNAS_JBKOJI_GCHKN_DET.csv 

SELECT 
'PLAN_ID' || ',' ||
'SEQ' || ',' ||
'CHOCHIKU_SHURUI_CD' || ',' ||
'AZUKEIRESAKI_NAME' || ',' ||
'YOCHOKIN_ZANDAKA' || ',' ||
'GEKKAN_TSUMITATEGAKU' || ',' ||
'TSUMITATEGAKU_BNS1' || ',' ||
'TSUMITATEGAKU_BNS2' || ',' ||
'TSUMITATEGAKU_OTHER' || ',' ||
'YOCHOKIN_COMMENT' || ',' ||
'SYSTEM_CREATE_DATE' || ',' ||
'SYSTEM_UPDATE_DATE' || ',' ||
FROM   dual;

SELECT 
PLAN_ID || ',' ||
SEQ || ',' ||
CHOCHIKU_SHURUI_CD || ',' ||
AZUKEIRESAKI_NAME || ',' ||
YOCHOKIN_ZANDAKA || ',' ||
GEKKAN_TSUMITATEGAKU || ',' ||
TSUMITATEGAKU_BNS1 || ',' ||
TSUMITATEGAKU_BNS2 || ',' ||
TSUMITATEGAKU_OTHER || ',' ||
YOCHOKIN_COMMENT || ',' ||
SYSTEM_CREATE_DATE || ',' ||
SYSTEM_UPDATE_DATE || ',' ||
FROM L_T_LNAS_JBKOJI_GCHKN_DET;

SPOOL OFF 
--------------------------------------------------

--------------------------------------------------
--LNAS準備済個人保有資産詳細
--L_T_LNAS_JBKOJI_HSSN_DET
SPOOL L_T_LNAS_JBKOJI_HSSN_DET.csv 

SELECT 
'PLAN_ID' || ',' ||
'SHISAN_DEBT_CD' || ',' ||
'SEQ' || ',' ||
'HOYUSSN_CD' || ',' ||
'HOYUSSN_NAME' || ',' ||
'HOYUSSN_GAKU' || ',' ||
'HOYUSSN_COMMENT' || ',' ||
'SYSTEM_CREATE_DATE' || ',' ||
'SYSTEM_UPDATE_DATE' || ',' ||
FROM   dual;

SELECT 
PLAN_ID || ',' ||
SHISAN_DEBT_CD || ',' ||
SEQ || ',' ||
HOYUSSN_CD || ',' ||
HOYUSSN_NAME || ',' ||
HOYUSSN_GAKU || ',' ||
HOYUSSN_COMMENT || ',' ||
SYSTEM_CREATE_DATE || ',' ||
SYSTEM_UPDATE_DATE || ',' ||
FROM L_T_LNAS_JBKOJI_HSSN_DET;

SPOOL OFF 
--------------------------------------------------

--------------------------------------------------
--LNAS準備済個人資産からの収入
--L_T_LNAS_JBKOJI_SNSN_DET
SPOOL L_T_LNAS_JBKOJI_SNSN_DET.csv 

SELECT 
'PLAN_ID' || ',' ||
'SEQ' || ',' ||
'HOYUSSN_SHUNYU_CD' || ',' ||
'HOYUSSN_SHUNYU_NAME' || ',' ||
'SHUNYU_START_JIKI' || ',' ||
'SHUNYU_START_NENSAI_CD' || ',' ||
'SHUNYU_END_JIKI' || ',' ||
'SHUNYU_END_NENSAI_CD' || ',' ||
'SHUNYU_KINGAKU' || ',' ||
'HOYUSSN_SHUNYU_COMMENT' || ',' ||
'SYSTEM_CREATE_DATE' || ',' ||
'SYSTEM_UPDATE_DATE' || ',' ||
FROM   dual;

SELECT 
PLAN_ID || ',' ||
SEQ || ',' ||
HOYUSSN_SHUNYU_CD || ',' ||
HOYUSSN_SHUNYU_NAME || ',' ||
SHUNYU_START_JIKI || ',' ||
SHUNYU_START_NENSAI_CD || ',' ||
SHUNYU_END_JIKI || ',' ||
SHUNYU_END_NENSAI_CD || ',' ||
SHUNYU_KINGAKU || ',' ||
HOYUSSN_SHUNYU_COMMENT || ',' ||
SYSTEM_CREATE_DATE || ',' ||
SYSTEM_UPDATE_DATE || ',' ||
FROM L_T_LNAS_JBKOJI_SNSN_DET;

SPOOL OFF 
--------------------------------------------------

--------------------------------------------------
--LNAS準備済個人セカンドライフお仕事
--L_T_LNAS_JBKOJI_SECLIFJOB
SPOOL L_T_LNAS_JBKOJI_SECLIFJOB.csv 

SELECT 
'PLAN_ID' || ',' ||
'FAMILY_HONSPO_CD' || ',' ||
'SEQ' || ',' ||
'SHIGOTO_NAME' || ',' ||
'SHIGOTO_START_JIKI' || ',' ||
'SHIGOTO_START_NENSAI_CD' || ',' ||
'SHIGOTO_END_JIKI' || ',' ||
'SHIGOTO_END_NENSAI_CD' || ',' ||
'SHIGOTO_NENSHU' || ',' ||
'SYSTEM_CREATE_DATE' || ',' ||
'SYSTEM_UPDATE_DATE' || ',' ||
FROM   dual;

SELECT 
PLAN_ID || ',' ||
FAMILY_HONSPO_CD || ',' ||
SEQ || ',' ||
SHIGOTO_NAME || ',' ||
SHIGOTO_START_JIKI || ',' ||
SHIGOTO_START_NENSAI_CD || ',' ||
SHIGOTO_END_JIKI || ',' ||
SHIGOTO_END_NENSAI_CD || ',' ||
SHIGOTO_NENSHU || ',' ||
SYSTEM_CREATE_DATE || ',' ||
SYSTEM_UPDATE_DATE || ',' ||
FROM L_T_LNAS_JBKOJI_SECLIFJOB;

SPOOL OFF 
--------------------------------------------------

--------------------------------------------------
--LNAS準備済個人生保･年金
--L_T_LNAS_JBKOJI_SEIHO_NENKIN
SPOOL L_T_LNAS_JBKOJI_SEIHO_NENKIN.csv 

SELECT 
'PLAN_ID' || ',' ||
'FAMILY_HONSPO_CD' || ',' ||
'SEIHO_MANKI_GAKU' || ',' ||
'SEIHO_MANKI_JIKI' || ',' ||
'DIEHK_ICHK_GAKU' || ',' ||
'DIEHK_ICHK_HOSHOKIKAN' || ',' ||
'DIEHK_ICHK_P' || ',' ||
'DIEHK_ICHK_P_HRIHH_CD' || ',' ||
'DIEHK_NENKIN_GAKU' || ',' ||
'DIEHK_NENKIN_HOSHOKIKAN' || ',' ||
'DIEHK_NENKIN_P' || ',' ||
'DIEHK_NENKIN_P_HRIHH_CD' || ',' ||
'KJNKN_UKETORI_GAKU' || ',' ||
'KJNKN_UKETORI_START' || ',' ||
'KJNKN_UKETORI_END' || ',' ||
'KJNKN_TSUMITATEGAKU' || ',' ||
'KJNKN_HRIHH_CD' || ',' ||
'KJNKN_TSUMITATE_KIKAN' || ',' ||
'NENKAN_HOKEN_GOKEI' || ',' ||
'SYSTEM_CREATE_DATE' || ',' ||
'SYSTEM_UPDATE_DATE' || ',' ||
FROM   dual;

SELECT 
PLAN_ID || ',' ||
FAMILY_HONSPO_CD || ',' ||
SEIHO_MANKI_GAKU || ',' ||
SEIHO_MANKI_JIKI || ',' ||
DIEHK_ICHK_GAKU || ',' ||
DIEHK_ICHK_HOSHOKIKAN || ',' ||
DIEHK_ICHK_P || ',' ||
DIEHK_ICHK_P_HRIHH_CD || ',' ||
DIEHK_NENKIN_GAKU || ',' ||
DIEHK_NENKIN_HOSHOKIKAN || ',' ||
DIEHK_NENKIN_P || ',' ||
DIEHK_NENKIN_P_HRIHH_CD || ',' ||
KJNKN_UKETORI_GAKU || ',' ||
KJNKN_UKETORI_START || ',' ||
KJNKN_UKETORI_END || ',' ||
KJNKN_TSUMITATEGAKU || ',' ||
KJNKN_HRIHH_CD || ',' ||
KJNKN_TSUMITATE_KIKAN || ',' ||
NENKAN_HOKEN_GOKEI || ',' ||
SYSTEM_CREATE_DATE || ',' ||
SYSTEM_UPDATE_DATE || ',' ||
FROM L_T_LNAS_JBKOJI_SEIHO_NENKIN;

SPOOL OFF 
--------------------------------------------------

--------------------------------------------------
--LNASかなえる資金
--L_T_LNAS_KNERSKN
SPOOL L_T_LNAS_KNERSKN.csv 

SELECT 
'PLAN_ID' || ',' ||
'GENZAI_NENSHU_SHISHUTSU' || ',' ||
'GENZAI_YOCHOKIN' || ',' ||
'GENZAI_SEIKATSUHI_ALFA' || ',' ||
'GENZAI_SEIKATSUHI' || ',' ||
'GENZAI_SEIMEI_P' || ',' ||
'GENZAI_OTHER_SHISHUTSU' || ',' ||
'GENZAI_TEDORI_NENSHU' || ',' ||
'KONGO_CHOCHIKU_ZOGAKU' || ',' ||
'KONGO_SEIKATSUHI' || ',' ||
'KONGO_SEIMEI_P' || ',' ||
'KONGO_OTHER_SHISHUTSU' || ',' ||
'KONGO_TEDORI_NENSHU' || ',' ||
'KONGO_YOJO_SHIKIN' || ',' ||
'SYSTEM_CREATE_DATE' || ',' ||
'SYSTEM_UPDATE_DATE' || ',' ||
FROM   dual;

SELECT 
PLAN_ID || ',' ||
GENZAI_NENSHU_SHISHUTSU || ',' ||
GENZAI_YOCHOKIN || ',' ||
GENZAI_SEIKATSUHI_ALFA || ',' ||
GENZAI_SEIKATSUHI || ',' ||
GENZAI_SEIMEI_P || ',' ||
GENZAI_OTHER_SHISHUTSU || ',' ||
GENZAI_TEDORI_NENSHU || ',' ||
KONGO_CHOCHIKU_ZOGAKU || ',' ||
KONGO_SEIKATSUHI || ',' ||
KONGO_SEIMEI_P || ',' ||
KONGO_OTHER_SHISHUTSU || ',' ||
KONGO_TEDORI_NENSHU || ',' ||
KONGO_YOJO_SHIKIN || ',' ||
SYSTEM_CREATE_DATE || ',' ||
SYSTEM_UPDATE_DATE || ',' ||
FROM L_T_LNAS_KNERSKN;

SPOOL OFF 
--------------------------------------------------

--------------------------------------------------
--LNASかなえる資金生活費明細
--L_T_LNAS_KNERSKN_SEIKATSUHI
SPOOL L_T_LNAS_KNERSKN_SEIKATSUHI.csv 

SELECT 
'PLAN_ID' || ',' ||
'GENZAI_SYORAI_CD' || ',' ||
'SEQ' || ',' ||
'SEIKATSUHI_ITEM_NAME' || ',' ||
'SEIKATSUHI_ITEM_KINGAKU' || ',' ||
'SYSTEM_CREATE_DATE' || ',' ||
'SYSTEM_UPDATE_DATE' || ',' ||
FROM   dual;

SELECT 
PLAN_ID || ',' ||
GENZAI_SYORAI_CD || ',' ||
SEQ || ',' ||
SEIKATSUHI_ITEM_NAME || ',' ||
SEIKATSUHI_ITEM_KINGAKU || ',' ||
SYSTEM_CREATE_DATE || ',' ||
SYSTEM_UPDATE_DATE || ',' ||
FROM L_T_LNAS_KNERSKN_SEIKATSUHI;

SPOOL OFF 
--------------------------------------------------

--------------------------------------------------
--LNASかなえる対策収入増加
--L_T_LNAS_KNERTSK_SHUNYU_UP
SPOOL L_T_LNAS_KNERTSK_SHUNYU_UP.csv 

SELECT 
'PLAN_ID' || ',' ||
'SEQ' || ',' ||
'SHUNYU_UP_CD' || ',' ||
'SHUNYU_UP_JIKI' || ',' ||
'SHUNYU_UP_KINGAKU' || ',' ||
'SHUNYU_UP_COMMENT' || ',' ||
'SYSTEM_CREATE_DATE' || ',' ||
'SYSTEM_UPDATE_DATE' || ',' ||
FROM   dual;

SELECT 
PLAN_ID || ',' ||
SEQ || ',' ||
SHUNYU_UP_CD || ',' ||
SHUNYU_UP_JIKI || ',' ||
SHUNYU_UP_KINGAKU || ',' ||
SHUNYU_UP_COMMENT || ',' ||
SYSTEM_CREATE_DATE || ',' ||
SYSTEM_UPDATE_DATE || ',' ||
FROM L_T_LNAS_KNERTSK_SHUNYU_UP;

SPOOL OFF 
--------------------------------------------------

--------------------------------------------------
--LNASかなえる対策ＰＰ
--L_T_LNAS_KNERSKN_PP
SPOOL L_T_LNAS_KNERSKN_PP.csv 

SELECT 
'PLAN_ID' || ',' ||
'SEQ' || ',' ||
'TAISAKIN_CD' || ',' ||
'TAISAKIN_COMMENT' || ',' ||
'SYSTEM_CREATE_DATE' || ',' ||
'SYSTEM_UPDATE_DATE' || ',' ||
FROM   dual;

SELECT 
PLAN_ID || ',' ||
SEQ || ',' ||
TAISAKIN_CD || ',' ||
TAISAKIN_COMMENT || ',' ||
SYSTEM_CREATE_DATE || ',' ||
SYSTEM_UPDATE_DATE || ',' ||
FROM L_T_LNAS_KNERSKN_PP;

SPOOL OFF 
--------------------------------------------------

--------------------------------------------------
--LNAS支える資金
--L_T_LNAS_SASAERU_SHIKIN
SPOOL L_T_LNAS_SASAERU_SHIKIN.csv 

SELECT 
'PLAN_ID' || ',' ||
'FAMILY_HONSPO_CD' || ',' ||
'GENZAI_SYORAI_CD' || ',' ||
'HITSUYO_MNY_FLG' || ',' ||
'JUMBI_MNY_FLG' || ',' ||
'KANYU_HOKEN_FLG' || ',' ||
'SHINKI_HOKEN_FLG' || ',' ||
'SYSTEM_CREATE_DATE' || ',' ||
'SYSTEM_UPDATE_DATE' || ',' ||
FROM   dual;

SELECT 
PLAN_ID || ',' ||
FAMILY_HONSPO_CD || ',' ||
GENZAI_SYORAI_CD || ',' ||
HITSUYO_MNY_FLG || ',' ||
JUMBI_MNY_FLG || ',' ||
KANYU_HOKEN_FLG || ',' ||
SHINKI_HOKEN_FLG || ',' ||
SYSTEM_CREATE_DATE || ',' ||
SYSTEM_UPDATE_DATE || ',' ||
FROM L_T_LNAS_SASAERU_SHIKIN;

SPOOL OFF 
--------------------------------------------------

--------------------------------------------------
--LNASくらし支援計画
--L_T_LNAS_SASAERU_SIEPLN
SPOOL L_T_LNAS_SASAERU_SIEPLN.csv 

SELECT 
'PLAN_ID' || ',' ||
'LIFE_SIEPLN_CD' || ',' ||
'FAMILY_HONSPO_CD' || ',' ||
'LIFE_SIEPLN_JUMBI_CD' || ',' ||
'SASAERU_RT' || ',' ||
'SHONENDO_GOKEIGAKU' || ',' ||
'SYSTEM_CREATE_DATE' || ',' ||
'SYSTEM_UPDATE_DATE' || ',' ||
FROM   dual;

SELECT 
PLAN_ID || ',' ||
LIFE_SIEPLN_CD || ',' ||
FAMILY_HONSPO_CD || ',' ||
LIFE_SIEPLN_JUMBI_CD || ',' ||
SASAERU_RT || ',' ||
SHONENDO_GOKEIGAKU || ',' ||
SYSTEM_CREATE_DATE || ',' ||
SYSTEM_UPDATE_DATE || ',' ||
FROM L_T_LNAS_SASAERU_SIEPLN;

SPOOL OFF 
--------------------------------------------------

--------------------------------------------------
--LNAS支える教育個別計画
--L_T_LNAS_SSKPLN_EDUC
SPOOL L_T_LNAS_SSKPLN_EDUC.csv 

SELECT 
'PLAN_ID' || ',' ||
'FAMILY_HONSPO_CD' || ',' ||
'FAMILY_CHILD_CD' || ',' ||
'YOCHIEN_SB_CD' || ',' ||
'SHOGAKKO_SB_CD' || ',' ||
'CHUGAKKO_SB_CD' || ',' ||
'KOKO_SB_CD' || ',' ||
'DAIGAKU_SB_CD' || ',' ||
'EDUC_SHIKIN_GOKEIGAKU' || ',' ||
'SASAERU_RT' || ',' ||
'SYSTEM_CREATE_DATE' || ',' ||
'SYSTEM_UPDATE_DATE' || ',' ||
FROM   dual;

SELECT 
PLAN_ID || ',' ||
FAMILY_HONSPO_CD || ',' ||
FAMILY_CHILD_CD || ',' ||
YOCHIEN_SB_CD || ',' ||
SHOGAKKO_SB_CD || ',' ||
CHUGAKKO_SB_CD || ',' ||
KOKO_SB_CD || ',' ||
DAIGAKU_SB_CD || ',' ||
EDUC_SHIKIN_GOKEIGAKU || ',' ||
SASAERU_RT || ',' ||
SYSTEM_CREATE_DATE || ',' ||
SYSTEM_UPDATE_DATE || ',' ||
FROM L_T_LNAS_SSKPLN_EDUC;

SPOOL OFF 
--------------------------------------------------

--------------------------------------------------
--LNAS支える結婚個別計画
--L_T_LNAS_SSKPLN_KEKKON
SPOOL L_T_LNAS_SSKPLN_KEKKON.csv 

SELECT 
'PLAN_ID' || ',' ||
'FAMILY_HONSPO_CD' || ',' ||
'FAMILY_CHILD_CD' || ',' ||
'KEKKON_AGE' || ',' ||
'KEKKON_ENJO_SHIKIN' || ',' ||
'SASAERU_RT' || ',' ||
'SYSTEM_CREATE_DATE' || ',' ||
'SYSTEM_UPDATE_DATE' || ',' ||
FROM   dual;

SELECT 
PLAN_ID || ',' ||
FAMILY_HONSPO_CD || ',' ||
FAMILY_CHILD_CD || ',' ||
KEKKON_AGE || ',' ||
KEKKON_ENJO_SHIKIN || ',' ||
SASAERU_RT || ',' ||
SYSTEM_CREATE_DATE || ',' ||
SYSTEM_UPDATE_DATE || ',' ||
FROM L_T_LNAS_SSKPLN_KEKKON;

SPOOL OFF 
--------------------------------------------------

--------------------------------------------------
--LNAS支える住宅個別計画
--L_T_LNAS_SSKPLN_JUTAKU
SPOOL L_T_LNAS_SSKPLN_JUTAKU.csv 

SELECT 
'PLAN_ID' || ',' ||
'FAMILY_HONSPO_CD' || ',' ||
'LIFE_SIEPLN_JUMBI_CD' || ',' ||
'GENZAI_JUKYO_TNTI_FLG' || ',' ||
'GENZAI_JUKYO_MTIE_FLG' || ',' ||
'SYORAI_JUKYO_CD' || ',' ||
'GENZAI_YACHIN' || ',' ||
'GENZAI_YACHIN_WRKN_CD' || ',' ||
'GENZAI_YACHIN_RT' || ',' ||
'GENZAI_YACHIN_KINGAKU' || ',' ||
'GENZAI_JLOAN_NENGAKU' || ',' ||
'GENZAI_LOAN_WRKN_CD' || ',' ||
'GENZAI_LOAN_RT' || ',' ||
'GENZAI_LOAN_KINGAKU' || ',' ||
'SYORAI_KONYU_KAKAKU' || ',' ||
'SYORAI_KONYU_WRKN_CD' || ',' ||
'SYORAI_KONYU_RT' || ',' ||
'SYORAI_KONYU_KINGAKU' || ',' ||
'JUTAKU_CHG_WRKN_CD' || ',' ||
'SYORAI_KONYU_SHOKEIHI' || ',' ||
'SHOKEIHI_KINGAKU' || ',' ||
'SYORAI_KONYU_KYOEKIHI' || ',' ||
'KYOEKIHI_KINGAKU' || ',' ||
'SYSTEM_CREATE_DATE' || ',' ||
'SYSTEM_UPDATE_DATE' || ',' ||
FROM   dual;

SELECT 
PLAN_ID || ',' ||
FAMILY_HONSPO_CD || ',' ||
LIFE_SIEPLN_JUMBI_CD || ',' ||
GENZAI_JUKYO_TNTI_FLG || ',' ||
GENZAI_JUKYO_MTIE_FLG || ',' ||
SYORAI_JUKYO_CD || ',' ||
GENZAI_YACHIN || ',' ||
GENZAI_YACHIN_WRKN_CD || ',' ||
GENZAI_YACHIN_RT || ',' ||
GENZAI_YACHIN_KINGAKU || ',' ||
GENZAI_JLOAN_NENGAKU || ',' ||
GENZAI_LOAN_WRKN_CD || ',' ||
GENZAI_LOAN_RT || ',' ||
GENZAI_LOAN_KINGAKU || ',' ||
SYORAI_KONYU_KAKAKU || ',' ||
SYORAI_KONYU_WRKN_CD || ',' ||
SYORAI_KONYU_RT || ',' ||
SYORAI_KONYU_KINGAKU || ',' ||
JUTAKU_CHG_WRKN_CD || ',' ||
SYORAI_KONYU_SHOKEIHI || ',' ||
SHOKEIHI_KINGAKU || ',' ||
SYORAI_KONYU_KYOEKIHI || ',' ||
KYOEKIHI_KINGAKU || ',' ||
SYSTEM_CREATE_DATE || ',' ||
SYSTEM_UPDATE_DATE || ',' ||
FROM L_T_LNAS_SSKPLN_JUTAKU;

SPOOL OFF 
--------------------------------------------------

--------------------------------------------------
--LNAS支える旅行個別計画
--L_T_LNAS_SSKPLN_RYOKO
SPOOL L_T_LNAS_SSKPLN_RYOKO.csv 

SELECT 
'PLAN_ID' || ',' ||
'FAMILY_HONSPO_CD' || ',' ||
'SEQ' || ',' ||
'RYOKO_CD' || ',' ||
'RYOKO_NAME' || ',' ||
'RYOKO_START_JIKI' || ',' ||
'RYOKO_START_NENSAI_CD' || ',' ||
'RYOKO_END_JIKI' || ',' ||
'RYOKO_END_NENSAI_CD' || ',' ||
'RYOKO_SYUKI_YEAR' || ',' ||
'RYOKO_KINGAKU' || ',' ||
'RYOKO_JUMBI_FLG' || ',' ||
'SYSTEM_CREATE_DATE' || ',' ||
'SYSTEM_UPDATE_DATE' || ',' ||
FROM   dual;

SELECT 
PLAN_ID || ',' ||
FAMILY_HONSPO_CD || ',' ||
SEQ || ',' ||
RYOKO_CD || ',' ||
RYOKO_NAME || ',' ||
RYOKO_START_JIKI || ',' ||
RYOKO_START_NENSAI_CD || ',' ||
RYOKO_END_JIKI || ',' ||
RYOKO_END_NENSAI_CD || ',' ||
RYOKO_SYUKI_YEAR || ',' ||
RYOKO_KINGAKU || ',' ||
RYOKO_JUMBI_FLG || ',' ||
SYSTEM_CREATE_DATE || ',' ||
SYSTEM_UPDATE_DATE || ',' ||
FROM L_T_LNAS_SSKPLN_RYOKO;

SPOOL OFF 
--------------------------------------------------

--------------------------------------------------
--LNAS支える耐久財個別計画
--L_T_LNAS_SSKPLN_TAIKYUZAI
SPOOL L_T_LNAS_SSKPLN_TAIKYUZAI.csv 

SELECT 
'PLAN_ID' || ',' ||
'FAMILY_HONSPO_CD' || ',' ||
'SEQ' || ',' ||
'KONYU_NAME' || ',' ||
'KONYU_START_JIKI' || ',' ||
'KONYU_START_NENSAI_CD' || ',' ||
'KONYU_END_JIKI' || ',' ||
'KONYU_END_NENSAI_CD' || ',' ||
'KONYU_SYUKI_YEAR' || ',' ||
'KONYU_KINGAKU' || ',' ||
'KONYU_JUMBI_FLG' || ',' ||
'SYSTEM_CREATE_DATE' || ',' ||
'SYSTEM_UPDATE_DATE' || ',' ||
FROM   dual;

SELECT 
PLAN_ID || ',' ||
FAMILY_HONSPO_CD || ',' ||
SEQ || ',' ||
KONYU_NAME || ',' ||
KONYU_START_JIKI || ',' ||
KONYU_START_NENSAI_CD || ',' ||
KONYU_END_JIKI || ',' ||
KONYU_END_NENSAI_CD || ',' ||
KONYU_SYUKI_YEAR || ',' ||
KONYU_KINGAKU || ',' ||
KONYU_JUMBI_FLG || ',' ||
SYSTEM_CREATE_DATE || ',' ||
SYSTEM_UPDATE_DATE || ',' ||
FROM L_T_LNAS_SSKPLN_TAIKYUZAI;

SPOOL OFF 
--------------------------------------------------

--------------------------------------------------
--LNAS支えるその他個別計画
--L_T_LNAS_SSKPLN_OTHER
SPOOL L_T_LNAS_SSKPLN_OTHER.csv 

SELECT 
'PLAN_ID' || ',' ||
'FAMILY_HONSPO_CD' || ',' ||
'SEQ' || ',' ||
'TAKIKK_MEISHO' || ',' ||
'TAKIKK_START_JIKI' || ',' ||
'TAKIKK_START' || ',' ||
'TAKIKK_END_JIKI' || ',' ||
'TAKIKK_END' || ',' ||
'TAKIKK_SYUKI' || ',' ||
'TAKIKK_KINGAKU' || ',' ||
'OTHER_JUMBI_FLG' || ',' ||
'SYSTEM_CREATE_DATE' || ',' ||
'SYSTEM_UPDATE_DATE' || ',' ||
FROM   dual;

SELECT 
PLAN_ID || ',' ||
FAMILY_HONSPO_CD || ',' ||
SEQ || ',' ||
TAKIKK_MEISHO || ',' ||
TAKIKK_START_JIKI || ',' ||
TAKIKK_START || ',' ||
TAKIKK_END_JIKI || ',' ||
TAKIKK_END || ',' ||
TAKIKK_SYUKI || ',' ||
TAKIKK_KINGAKU || ',' ||
OTHER_JUMBI_FLG || ',' ||
SYSTEM_CREATE_DATE || ',' ||
SYSTEM_UPDATE_DATE || ',' ||
FROM L_T_LNAS_SSKPLN_OTHER;

SPOOL OFF 
--------------------------------------------------

--------------------------------------------------
--LNAS支える万一計画変更詳細
--L_T_LNAS_SSKPLN_HAP_DET
SPOOL L_T_LNAS_SSKPLN_HAP_DET.csv 

SELECT 
'PLAN_ID' || ',' ||
'LIFE_SIEPLN_CD' || ',' ||
'FAMILY_HONSPO_CD' || ',' ||
'SEQ' || ',' ||
'KEIKAKUHENKO_START' || ',' ||
'KEIHEN_STR_NENSAI_CD' || ',' ||
'KEIKAKUHENKO_END' || ',' ||
'KEIHEN_END_NENSAI_CD' || ',' ||
'KEIKAKUHENKO_KINGAKU' || ',' ||
'SYSTEM_CREATE_DATE' || ',' ||
'SYSTEM_UPDATE_DATE' || ',' ||
FROM   dual;

SELECT 
PLAN_ID || ',' ||
LIFE_SIEPLN_CD || ',' ||
FAMILY_HONSPO_CD || ',' ||
SEQ || ',' ||
KEIKAKUHENKO_START || ',' ||
KEIHEN_STR_NENSAI_CD || ',' ||
KEIKAKUHENKO_END || ',' ||
KEIHEN_END_NENSAI_CD || ',' ||
KEIKAKUHENKO_KINGAKU || ',' ||
SYSTEM_CREATE_DATE || ',' ||
SYSTEM_UPDATE_DATE || ',' ||
FROM L_T_LNAS_SSKPLN_HAP_DET;

SPOOL OFF 
--------------------------------------------------

--------------------------------------------------
--LNAS支える万一保有資産変更
--L_T_LNAS_SSKPLN_HOYUSSN
SPOOL L_T_LNAS_SSKPLN_HOYUSSN.csv 

SELECT 
'PLAN_ID' || ',' ||
'FAMILY_HONSPO_CD' || ',' ||
'FUDOSAN_BAIKYAKU_UMU_CD' || ',' ||
'YKSK_BAIKYAKU_UMU_CD' || ',' ||
'OTHER_BAIKYAKU_UMU_CD' || ',' ||
'KARIREKIN_UMU_CD' || ',' ||
'SYSTEM_CREATE_DATE' || ',' ||
'SYSTEM_UPDATE_DATE' || ',' ||
FROM   dual;

SELECT 
PLAN_ID || ',' ||
FAMILY_HONSPO_CD || ',' ||
FUDOSAN_BAIKYAKU_UMU_CD || ',' ||
YKSK_BAIKYAKU_UMU_CD || ',' ||
OTHER_BAIKYAKU_UMU_CD || ',' ||
KARIREKIN_UMU_CD || ',' ||
SYSTEM_CREATE_DATE || ',' ||
SYSTEM_UPDATE_DATE || ',' ||
FROM L_T_LNAS_SSKPLN_HOYUSSN;

SPOOL OFF 
--------------------------------------------------

--------------------------------------------------
--LNAS支える保有資産収入変更詳細
--L_T_LNAS_SSKPLN_SNSN_DET
SPOOL L_T_LNAS_SSKPLN_SNSN_DET.csv 

SELECT 
'PLAN_ID' || ',' ||
'FAMILY_HONSPO_CD' || ',' ||
'HOYUSSN_SHUNYU_CD' || ',' ||
'SHUNYU_START_JIKI' || ',' ||
'SHUNYU_START_NENSAI_CD' || ',' ||
'SHUNYU_END_JIKI' || ',' ||
'SHUNYU_END_NENSAI_CD' || ',' ||
'SHUNYU_KINGAKU' || ',' ||
'SYSTEM_CREATE_DATE' || ',' ||
'SYSTEM_UPDATE_DATE' || ',' ||
FROM   dual;

SELECT 
PLAN_ID || ',' ||
FAMILY_HONSPO_CD || ',' ||
HOYUSSN_SHUNYU_CD || ',' ||
SHUNYU_START_JIKI || ',' ||
SHUNYU_START_NENSAI_CD || ',' ||
SHUNYU_END_JIKI || ',' ||
SHUNYU_END_NENSAI_CD || ',' ||
SHUNYU_KINGAKU || ',' ||
SYSTEM_CREATE_DATE || ',' ||
SYSTEM_UPDATE_DATE || ',' ||
FROM L_T_LNAS_SSKPLN_SNSN_DET;

SPOOL OFF 
--------------------------------------------------



SET ECHO ON 
SET FEEDBACK ON 
SET HEADING ON 
SET PAGESIZE 24
SET TERMOUT ON 
SET TRIMSPOOL OFF 