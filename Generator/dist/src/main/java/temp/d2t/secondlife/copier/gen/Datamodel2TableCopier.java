package temp.d2t.secondlife.copier.gen;

import jp.co.axa.life.app.lt.util.ConverterUtility;
import temp.d2t.secondlife.datamodel.gen.LtPlanCollection;
import temp.d2t.secondlife.datamodel.gen.Lrsc0304Collection;
import temp.d2t.secondlife.datamodel.gen.Lrsc030501Collection;
import temp.d2t.secondlife.datamodel.gen.Lrsc030201Collection;
import temp.d2t.secondlife.datamodel.gen.Collection;
import temp.d2t.secondlife.datamodel.gen.Lrsc030202Collection;
import temp.d2t.secondlife.datamodel.gen.Lrsc030203Collection;
import temp.d2t.secondlife.datamodel.gen.Lrsc030204Collection;
import temp.d2t.secondlife.datamodel.gen.LtPensionCollection;
import temp.d2t.secondlife.datamodel.gen.Lrsc030502Collection;
import temp.d2t.secondlife.datamodel.gen.LRSC030503Collection;
import temp.d2t.secondlife.entity.gen.TLrms2lfKihon;
import temp.d2t.secondlife.entity.gen.TLrms2lfHysknLife;
import temp.d2t.secondlife.entity.gen.TLrms2lfHysknJutaku;
import temp.d2t.secondlife.entity.gen.TLrms2lfHysknEvent;
import temp.d2t.secondlife.entity.gen.TLrms2lfHysknOther;
import temp.d2t.secondlife.entity.gen.TLrms2lfJzsknNkjkm;
import temp.d2t.secondlife.entity.gen.TLrms2lfJzsknNkknm;
import temp.d2t.secondlife.entity.gen.TLrms2lfJzsknShunyu;
import temp.d2t.secondlife.entity.gen.TLrms2lfJzsknOther;


public class Datamodel2TableCopier{


	/*
	 * データ変換処理：
	 * ＬＲＭＳセカンドライフ:T_LRMS_2LF_KIHON
	 */
	static public TLrms2lfKihon transferTLrms2LfKihon(LtPlanCollection ltPlanCollection, Lrsc0304Collection lrsc0304Collection, Lrsc030501Collection lrsc030501Collection){
		//パラメターのNULLチェック：	
		if( ltPlanCollection == null)
			ltPlanCollection =new LtPlanCollection ();
		if( lrsc0304Collection == null)
			lrsc0304Collection =new Lrsc0304Collection ();
		if( lrsc030501Collection == null)
			lrsc030501Collection =new Lrsc030501Collection ();

		TLrms2lfKihon result=new TLrms2lfKihon();
		{
			//FROM:画面データモデル:LtPlan 入力:プランID key名:planId 型: 備考: このアプリ内で、ユニークなプランID（UUID形式）(DBテーブルの主キー）
			//TO:テーブル.テーブル:T_LRMS_2LF_KIHON 論理:プランID 物理:PLAN_ID 属性:Varchar2 桁数:36 少数: 備考:
			//TODO:
			result.setPlanId(ConverterUtility.convert(String.class,ltPlanCollection.getPlanId()));
		}
		{
			//FROM:画面データモデル:Lrsc0304 入力:世帯主退職金 key名:retirementMoneyHh 型:NUMBER 備考: 
			//TO:テーブル.テーブル:T_LRMS_2LF_KIHON 論理:準備済資金 退職金（主） 物理:JZSKN_TAISHOKUKIN_MAIN 属性:Number 桁数:11 少数: 備考:×10000
			//TODO:
			result.setJzsknTaishokukinMain(ConverterUtility.convert(java.math.BigDecimal.class,lrsc0304Collection.getRetirementMoneyHh()));
		}
		{
			//FROM:画面データモデル:Lrsc0304 入力:配偶者退職金 key名:retirementMoneySp 型:NUMBER 備考: 
			//TO:テーブル.テーブル:T_LRMS_2LF_KIHON 論理:準備済資金 退職金（配） 物理:JZSKN_TAISHOKUKIN_SP 属性:Number 桁数:11 少数: 備考:×10000
			//TODO:
			result.setJzsknTaishokukinSp(ConverterUtility.convert(java.math.BigDecimal.class,lrsc0304Collection.getRetirementMoneySp()));
		}
		{
			//FROM:画面データモデル:Lrsc0304 入力:預貯金 key名:deposit 型:NUMBER 備考: 
			//TO:テーブル.テーブル:T_LRMS_2LF_KIHON 論理:準備済資金 預貯金 物理:JZSKN_YOCHOKIN 属性:Number 桁数:11 少数: 備考:×10000
			//TODO:
			result.setJzsknYochokin(ConverterUtility.convert(java.math.BigDecimal.class,lrsc0304Collection.getDeposit()));
		}
		{
			//FROM:画面データモデル:Lrsc030501 入力:入力方法 key名:inputMethod 型:CODE 備考: 同モデル内の世帯主配偶者識別フラグ（personSpouseFlg）が1：世帯主のデータ
			//TO:テーブル.テーブル:T_LRMS_2LF_KIHON 論理:年金情報入力種別コード（主） 物理:NENKIN_INPUT_CD_MAIN 属性:Char 桁数:1 少数: 備考:
			//TODO:
			result.setNenkinInputCdMain(ConverterUtility.convert(String.class,lrsc030501Collection.getInputMethod()));
		}
		{
			//FROM:画面データモデル:Lrsc030501 入力:入力方法 key名:inputMethod 型:CODE 備考: 同モデル内の世帯主配偶者識別フラグ（personSpouseFlg）が2：配偶者のデータ
			//TO:テーブル.テーブル:T_LRMS_2LF_KIHON 論理:年金情報入力種別コード（配） 物理:NENKIN_INPUT_CD_SP 属性:Char 桁数:1 少数: 備考:
			//TODO:
			result.setNenkinInputCdSp(ConverterUtility.convert(String.class,lrsc030501Collection.getInputMethod()));
		}
		{
			//FROM:画面データモデル:登録時のSYSDATEをセット 入力: key名: 型: 備考: 
			//TO:テーブル.テーブル:T_LRMS_2LF_KIHON 論理:システム作成日時 物理:SYSTEM_CREATE_DATE 属性:Date 桁数:　 少数: 備考:
			//TODO:
			//result.setSystemCreateDate(ConverterUtility.convert(java.util.Date.class,登録時のSYSDATEをセットCollection.get()));
		}
		{
			//FROM:画面データモデル:登録時のSYSDATEをセット 入力: key名: 型: 備考: 
			//TO:テーブル.テーブル:T_LRMS_2LF_KIHON 論理:システム更新日時 物理:SYSTEM_UPDATE_DATE 属性:Date 桁数:　 少数: 備考:
			//TODO:
			//result.setSystemUpdateDate(ConverterUtility.convert(java.util.Date.class,登録時のSYSDATEをセットCollection.get()));
		}

		return result;

	}

	/*
	 * データ変換処理：
	 * ＬＲＭＳセカンドライフ:T_LRMS_2LF_HYSKN_LIFE
	 */
	static public TLrms2lfHysknLife transferTLrms2LfHysknLife(LtPlanCollection ltPlanCollection, Lrsc030201Collection lrsc030201Collection, Collection collection){
		//パラメターのNULLチェック：	
		if( ltPlanCollection == null)
			ltPlanCollection =new LtPlanCollection ();
		if( lrsc030201Collection == null)
			lrsc030201Collection =new Lrsc030201Collection ();
		if( collection == null)
			collection =new Collection ();

		TLrms2lfHysknLife result=new TLrms2lfHysknLife();
		{
			//FROM:画面データモデル:LtPlan 入力:プランID key名:planId 型: 備考: このアプリ内で、ユニークなプランID（UUID形式）(DBテーブルの主キー）
			//TO:テーブル.テーブル:T_LRMS_2LF_HYSKN_LIFE 論理:プランID 物理:PLAN_ID 属性:Varchar2 桁数:36 少数: 備考:
			//TODO:
			result.setPlanId(ConverterUtility.convert(String.class,ltPlanCollection.getPlanId()));
		}
		{
			//FROM:画面データモデル:Lrsc030201 入力: key名: 型: 備考: 
			//TO:テーブル.テーブル:T_LRMS_2LF_HYSKN_LIFE 論理:SEQ 物理:SEQ 属性:Number 桁数:1 少数: 備考:
			//TODO:
			//result.setSeq(ConverterUtility.convert(java.math.BigDecimal.class,lrsc030201Collection.get()));
		}
		{
			//FROM:画面データモデル:老後リスク必要資金(生活費の詳細入力値) 入力: key名: 型: 備考: 
			//TO:テーブル.テーブル:T_LRMS_2LF_HYSKN_LIFE 論理:生活費項目名 物理:SEIKATSUHI_ITEM_NAME 属性:Varchar2 桁数:10 少数: 備考:
			//TODO:
			//result.setSeikatsuhiItemName(ConverterUtility.convert(String.class,老後リスク必要資金(生活費の詳細入力値)Collection.get()));
		}
		{
			//FROM:画面データモデル: 入力: key名: 型: 備考: 
			//TO:テーブル.テーブル:T_LRMS_2LF_HYSKN_LIFE 論理:生活費項目金額 物理:SEIKATSUHI_ITEM_KINGAKU 属性:Number 桁数:11 少数: 備考:
			//TODO:
			//result.setSeikatsuhiItemKingaku(ConverterUtility.convert(java.math.BigDecimal.class,Collection.get()));
		}
		{
			//FROM:画面データモデル:登録時のSYSDATEをセット 入力: key名: 型: 備考: 
			//TO:テーブル.テーブル:T_LRMS_2LF_HYSKN_LIFE 論理:システム作成日時 物理:SYSTEM_CREATE_DATE 属性:Date 桁数:　 少数: 備考:
			//TODO:
			//result.setSystemCreateDate(ConverterUtility.convert(java.util.Date.class,登録時のSYSDATEをセットCollection.get()));
		}
		{
			//FROM:画面データモデル:登録時のSYSDATEをセット 入力: key名: 型: 備考: 
			//TO:テーブル.テーブル:T_LRMS_2LF_HYSKN_LIFE 論理:システム更新日時 物理:SYSTEM_UPDATE_DATE 属性:Date 桁数:　 少数: 備考:
			//TODO:
			//result.setSystemUpdateDate(ConverterUtility.convert(java.util.Date.class,登録時のSYSDATEをセットCollection.get()));
		}

		return result;

	}

	/*
	 * データ変換処理：
	 * ＬＲＭＳセカンドライフ:T_LRMS_2LF_HYSKN_JUTAKU
	 */
	static public TLrms2lfHysknJutaku transferTLrms2LfHysknJutaku(LtPlanCollection ltPlanCollection, Lrsc030202Collection lrsc030202Collection){
		//パラメターのNULLチェック：	
		if( ltPlanCollection == null)
			ltPlanCollection =new LtPlanCollection ();
		if( lrsc030202Collection == null)
			lrsc030202Collection =new Lrsc030202Collection ();

		TLrms2lfHysknJutaku result=new TLrms2lfHysknJutaku();
		{
			//FROM:画面データモデル:LtPlan 入力:プランID key名:planId 型: 備考: このアプリ内で、ユニークなプランID（UUID形式）(DBテーブルの主キー）
			//TO:テーブル.テーブル:T_LRMS_2LF_HYSKN_JUTAKU 論理:プランID 物理:PLAN_ID 属性:Varchar2 桁数:36 少数: 備考:
			//TODO:
			result.setPlanId(ConverterUtility.convert(String.class,ltPlanCollection.getPlanId()));
		}
		{
			//FROM:画面データモデル:Lrsc030202 入力:住宅区分 key名:radioHouseKbn 型:CODE 備考: 
			//TO:テーブル.テーブル:T_LRMS_2LF_HYSKN_JUTAKU 論理:現在住居コード 物理:GENZAI_JUKYO_CD 属性:Char 桁数:1 少数: 備考:
			//TODO:
			result.setGenzaiJukyoCd(ConverterUtility.convert(String.class,lrsc030202Collection.getRadioHouseKbn()));
		}
		{
			//FROM:画面データモデル:Lrsc030202 入力:現在家賃 key名:currentRent 型:NUMBER 備考: 
			//TO:テーブル.テーブル:T_LRMS_2LF_HYSKN_JUTAKU 論理:現在家賃 物理:GENZAI_YACHIN 属性:Number 桁数:11 少数: 備考:
			//TODO:
			result.setGenzaiYachin(ConverterUtility.convert(java.math.BigDecimal.class,lrsc030202Collection.getCurrentRent()));
		}
		{
			//FROM:画面データモデル:Lrsc030202 入力:返済額 key名:amountRepaid 型:NUMBER 備考: 
			//TO:テーブル.テーブル:T_LRMS_2LF_HYSKN_JUTAKU 論理:月額返済額 物理:GETSUGAKU_HENSAIGAKU 属性:Number 桁数:11 少数: 備考:
			//TODO:
			result.setGetsugakuHensaigaku(ConverterUtility.convert(java.math.BigDecimal.class,lrsc030202Collection.getAmountRepaid()));
		}
		{
			//FROM:画面データモデル:Lrsc030202 入力:残返済期間 key名:remainingDuration 型:NUMBER 備考: 
			//TO:テーブル.テーブル:T_LRMS_2LF_HYSKN_JUTAKU 論理:返済期間 物理:HENSAI_KIKAN 属性:Number 桁数:2 少数: 備考:
			//TODO:
			result.setHensaiKikan(ConverterUtility.convert(java.math.BigDecimal.class,lrsc030202Collection.getRemainingDuration()));
		}
		{
			//FROM:画面データモデル:登録時のSYSDATEをセット 入力: key名: 型: 備考: 
			//TO:テーブル.テーブル:T_LRMS_2LF_HYSKN_JUTAKU 論理:システム作成日時 物理:SYSTEM_CREATE_DATE 属性:Date 桁数:　 少数: 備考:
			//TODO:
			//result.setSystemCreateDate(ConverterUtility.convert(java.util.Date.class,登録時のSYSDATEをセットCollection.get()));
		}
		{
			//FROM:画面データモデル:登録時のSYSDATEをセット 入力: key名: 型: 備考: 
			//TO:テーブル.テーブル:T_LRMS_2LF_HYSKN_JUTAKU 論理:システム更新日時 物理:SYSTEM_UPDATE_DATE 属性:Date 桁数:　 少数: 備考:
			//TODO:
			//result.setSystemUpdateDate(ConverterUtility.convert(java.util.Date.class,登録時のSYSDATEをセットCollection.get()));
		}

		return result;

	}

	/*
	 * データ変換処理：
	 * ＬＲＭＳセカンドライフ:T_LRMS_2LF_HYSKN_EVENT
	 */
	static public TLrms2lfHysknEvent transferTLrms2LfHysknEvent(LtPlanCollection ltPlanCollection, Lrsc030203Collection lrsc030203Collection){
		//パラメターのNULLチェック：	
		if( ltPlanCollection == null)
			ltPlanCollection =new LtPlanCollection ();
		if( lrsc030203Collection == null)
			lrsc030203Collection =new Lrsc030203Collection ();

		TLrms2lfHysknEvent result=new TLrms2lfHysknEvent();
		{
			//FROM:画面データモデル:LtPlan 入力:プランID key名:planId 型: 備考: このアプリ内で、ユニークなプランID（UUID形式）(DBテーブルの主キー）
			//TO:テーブル.テーブル:T_LRMS_2LF_HYSKN_EVENT 論理:プランID 物理:PLAN_ID 属性:Varchar2 桁数:36 少数: 備考:
			//TODO:
			result.setPlanId(ConverterUtility.convert(String.class,ltPlanCollection.getPlanId()));
		}
		{
			//FROM:画面データモデル:Lrsc030203 入力:id key名:id 型:NUMBER 備考: 
			//TO:テーブル.テーブル:T_LRMS_2LF_HYSKN_EVENT 論理:SEQ 物理:SEQ 属性:Number 桁数:1 少数: 備考:
			//TODO:
			result.setSeq(ConverterUtility.convert(java.math.BigDecimal.class,lrsc030203Collection.getId()));
		}
		{
			//FROM:画面データモデル:Lrsc030203 入力:趣味イベント名 key名:hobbyName 型:CHAR 備考: 
			//TO:テーブル.テーブル:T_LRMS_2LF_HYSKN_EVENT 論理:必要資金（趣味・イベント）名 物理:HYSKN_EVENT_NAME 属性:Varchar2 桁数:10 少数: 備考:
			//TODO:
			result.setHysknEventName(ConverterUtility.convert(String.class,lrsc030203Collection.getHobbyName()));
		}
		{
			//FROM:画面データモデル:Lrsc030203 入力:趣味イベント利用開始年齢 key名:hobbyStartAge 型:NUMBER 備考: 
			//TO:テーブル.テーブル:T_LRMS_2LF_HYSKN_EVENT 論理:趣味・イベント 開始年齢 物理:EVENT_START_AGE 属性:Number 桁数:3 少数: 備考:
			//TODO:
			result.setEventStartAge(ConverterUtility.convert(java.math.BigDecimal.class,lrsc030203Collection.getHobbyStartAge()));
		}
		{
			//FROM:画面データモデル:Lrsc030203 入力:趣味イベント利用終了年齢 key名:hobbyEndAge 型:NUMBER 備考: 
			//TO:テーブル.テーブル:T_LRMS_2LF_HYSKN_EVENT 論理:趣味・イベント 終了年齢 物理:EVENT_END_AGE 属性:Number 桁数:3 少数: 備考:
			//TODO:
			result.setEventEndAge(ConverterUtility.convert(java.math.BigDecimal.class,lrsc030203Collection.getHobbyEndAge()));
		}
		{
			//FROM:画面データモデル:Lrsc030203 入力:趣味イベント利用頻度 key名:hobbyInterval 型:NUMBER 備考: 
			//TO:テーブル.テーブル:T_LRMS_2LF_HYSKN_EVENT 論理:趣味・イベント 周期 物理:EVENT_SYUKI 属性:Number 桁数:2 少数: 備考:
			//TODO:
			result.setEventSyuki(ConverterUtility.convert(java.math.BigDecimal.class,lrsc030203Collection.getHobbyInterval()));
		}
		{
			//FROM:画面データモデル:Lrsc030203 入力:趣味イベント費用 key名:hobbyCost 型:NUMBER 備考: 
			//TO:テーブル.テーブル:T_LRMS_2LF_HYSKN_EVENT 論理:趣味・イベント 必要金額 物理:EVENT_HITSUYO_KINGAKU 属性:Number 桁数:11 少数: 備考:×10000
			//TODO:
			result.setEventHitsuyoKingaku(ConverterUtility.convert(java.math.BigDecimal.class,lrsc030203Collection.getHobbyCost()));
		}
		{
			//FROM:画面データモデル:登録時のSYSDATEをセット 入力: key名: 型: 備考: 
			//TO:テーブル.テーブル:T_LRMS_2LF_HYSKN_EVENT 論理:システム作成日時 物理:SYSTEM_CREATE_DATE 属性:Date 桁数:　 少数: 備考:
			//TODO:
			//result.setSystemCreateDate(ConverterUtility.convert(java.util.Date.class,登録時のSYSDATEをセットCollection.get()));
		}
		{
			//FROM:画面データモデル:登録時のSYSDATEをセット 入力: key名: 型: 備考: 
			//TO:テーブル.テーブル:T_LRMS_2LF_HYSKN_EVENT 論理:システム更新日時 物理:SYSTEM_UPDATE_DATE 属性:Date 桁数:　 少数: 備考:
			//TODO:
			//result.setSystemUpdateDate(ConverterUtility.convert(java.util.Date.class,登録時のSYSDATEをセットCollection.get()));
		}

		return result;

	}

	/*
	 * データ変換処理：
	 * ＬＲＭＳセカンドライフ:T_LRMS_2LF_HYSKN_OTHER
	 */
	static public TLrms2lfHysknOther transferTLrms2LfHysknOther(LtPlanCollection ltPlanCollection, Lrsc030204Collection lrsc030204Collection){
		//パラメターのNULLチェック：	
		if( ltPlanCollection == null)
			ltPlanCollection =new LtPlanCollection ();
		if( lrsc030204Collection == null)
			lrsc030204Collection =new Lrsc030204Collection ();

		TLrms2lfHysknOther result=new TLrms2lfHysknOther();
		{
			//FROM:画面データモデル:LtPlan 入力:プランID key名:planId 型: 備考: このアプリ内で、ユニークなプランID（UUID形式）(DBテーブルの主キー）
			//TO:テーブル.テーブル:T_LRMS_2LF_HYSKN_OTHER 論理:プランID 物理:PLAN_ID 属性:Varchar2 桁数:36 少数: 備考:
			//TODO:
			result.setPlanId(ConverterUtility.convert(String.class,ltPlanCollection.getPlanId()));
		}
		{
			//FROM:画面データモデル:Lrsc030204 入力:id key名:id 型:NUMBER 備考: 
			//TO:テーブル.テーブル:T_LRMS_2LF_HYSKN_OTHER 論理:SEQ 物理:SEQ 属性:Number 桁数:1 少数: 備考:
			//TODO:
			result.setSeq(ConverterUtility.convert(java.math.BigDecimal.class,lrsc030204Collection.getId()));
		}
		{
			//FROM:画面データモデル:Lrsc030204 入力:その他必要資金購入品名 key名:otherName 型:CHAR 備考: 
			//TO:テーブル.テーブル:T_LRMS_2LF_HYSKN_OTHER 論理:必要資金（その他）名 物理:HYSKN_OTHER_NAME 属性:Varchar2 桁数:10 少数: 備考:
			//TODO:
			result.setHysknOtherName(ConverterUtility.convert(String.class,lrsc030204Collection.getOtherName()));
		}
		{
			//FROM:画面データモデル:Lrsc030204 入力:その他必要資金利用開始年齢 key名:otherStartAge 型:NUMBER 備考: 
			//TO:テーブル.テーブル:T_LRMS_2LF_HYSKN_OTHER 論理:その他必要 開始年齢 物理:OTHER_HITSUYO_START_AGE 属性:Number 桁数:3 少数: 備考:
			//TODO:
			result.setOtherHitsuyoStartAge(ConverterUtility.convert(java.math.BigDecimal.class,lrsc030204Collection.getOtherStartAge()));
		}
		{
			//FROM:画面データモデル:Lrsc030204 入力:その他必要資金利用終了年齢 key名:otherEndAge 型:NUMBER 備考: 
			//TO:テーブル.テーブル:T_LRMS_2LF_HYSKN_OTHER 論理:その他必要 終了年齢 物理:OTHER_HITSUYO_END_AGE 属性:Number 桁数:3 少数: 備考:
			//TODO:
			result.setOtherHitsuyoEndAge(ConverterUtility.convert(java.math.BigDecimal.class,lrsc030204Collection.getOtherEndAge()));
		}
		{
			//FROM:画面データモデル:Lrsc030204 入力:その他必要資金利用頻度 key名:otherInterval 型:NUMBER 備考: 
			//TO:テーブル.テーブル:T_LRMS_2LF_HYSKN_OTHER 論理:その他必要 周期 物理:OTHER_HITSUYO_SYUKI 属性:Number 桁数:2 少数: 備考:
			//TODO:
			result.setOtherHitsuyoSyuki(ConverterUtility.convert(java.math.BigDecimal.class,lrsc030204Collection.getOtherInterval()));
		}
		{
			//FROM:画面データモデル:Lrsc030204 入力:その他必要資金購入予定金額 key名:otherCost 型:NUMBER 備考: 
			//TO:テーブル.テーブル:T_LRMS_2LF_HYSKN_OTHER 論理:その他必要 金額 物理:OTHER_HITSUYO_KINGAKU 属性:Number 桁数:11 少数: 備考:×10000
			//TODO:
			result.setOtherHitsuyoKingaku(ConverterUtility.convert(java.math.BigDecimal.class,lrsc030204Collection.getOtherCost()));
		}
		{
			//FROM:画面データモデル:登録時のSYSDATEをセット 入力: key名: 型: 備考: 
			//TO:テーブル.テーブル:T_LRMS_2LF_HYSKN_OTHER 論理:システム作成日時 物理:SYSTEM_CREATE_DATE 属性:Date 桁数:　 少数: 備考:
			//TODO:
			//result.setSystemCreateDate(ConverterUtility.convert(java.util.Date.class,登録時のSYSDATEをセットCollection.get()));
		}
		{
			//FROM:画面データモデル:登録時のSYSDATEをセット 入力: key名: 型: 備考: 
			//TO:テーブル.テーブル:T_LRMS_2LF_HYSKN_OTHER 論理:システム更新日時 物理:SYSTEM_UPDATE_DATE 属性:Date 桁数:　 少数: 備考:
			//TODO:
			//result.setSystemUpdateDate(ConverterUtility.convert(java.util.Date.class,登録時のSYSDATEをセットCollection.get()));
		}

		return result;

	}

	/*
	 * データ変換処理：
	 * ＬＲＭＳセカンドライフ:T_LRMS_2LF_JZSKN_NKJKM
	 */
	static public TLrms2lfJzsknNkjkm transferTLrms2LfJzsknNkjkm(LtPlanCollection ltPlanCollection, Lrsc030501Collection lrsc030501Collection, Collection collection){
		//パラメターのNULLチェック：	
		if( ltPlanCollection == null)
			ltPlanCollection =new LtPlanCollection ();
		if( lrsc030501Collection == null)
			lrsc030501Collection =new Lrsc030501Collection ();
		if( collection == null)
			collection =new Collection ();

		TLrms2lfJzsknNkjkm result=new TLrms2lfJzsknNkjkm();
		{
			//FROM:画面データモデル:LtPlan 入力:プランID key名:planId 型: 備考: このアプリ内で、ユニークなプランID（UUID形式）(DBテーブルの主キー）
			//TO:テーブル.テーブル:T_LRMS_2LF_JZSKN_NKJKM 論理:プランID 物理:PLAN_ID 属性:Varchar2 桁数:36 少数: 備考:
			//TODO:
			result.setPlanId(ConverterUtility.convert(String.class,ltPlanCollection.getPlanId()));
		}
		{
			//FROM:画面データモデル:Lrsc030501 入力:世帯主配偶者識別フラグ key名:personSpouseFlg 型: 備考: 1：世帯主、2：配偶者
			//TO:テーブル.テーブル:T_LRMS_2LF_JZSKN_NKJKM 論理:家族コード（本人/配偶者） 物理:FAMILY_HONSPO_CD 属性:Char 桁数:2 少数: 備考:
			//TODO:
			result.setFamilyHonspoCd(ConverterUtility.convert(String.class,lrsc030501Collection.getPersonSpouseFlg()));
		}
		{
			//FROM:画面データモデル:老後リスク準備済資金(公的年金の詳細入力値) 入力: key名: 型: 備考: 
			//TO:テーブル.テーブル:T_LRMS_2LF_JZSKN_NKJKM 論理:SEQ 物理:SEQ 属性:Number 桁数:1 少数: 備考:
			//TODO:
			//result.setSeq(ConverterUtility.convert(java.math.BigDecimal.class,老後リスク準備済資金(公的年金の詳細入力値)Collection.get()));
		}
		{
			//FROM:画面データモデル: 入力: key名: 型: 備考: 
			//TO:テーブル.テーブル:T_LRMS_2LF_JZSKN_NKJKM 論理:年金開始年齢 物理:NENKIN_START_AGE 属性:Number 桁数:3 少数: 備考:
			//TODO:
			//result.setNenkinStartAge(ConverterUtility.convert(java.math.BigDecimal.class,Collection.get()));
		}
		{
			//FROM:画面データモデル: 入力: key名: 型: 備考: 
			//TO:テーブル.テーブル:T_LRMS_2LF_JZSKN_NKJKM 論理:年金終了年齢 物理:NENKIN_END_AGE 属性:Number 桁数:3 少数: 備考:
			//TODO:
			//result.setNenkinEndAge(ConverterUtility.convert(java.math.BigDecimal.class,Collection.get()));
		}
		{
			//FROM:画面データモデル: 入力: key名: 型: 備考: 
			//TO:テーブル.テーブル:T_LRMS_2LF_JZSKN_NKJKM 論理:年金金額 物理:NENKIN_KINGAKU 属性:Number 桁数:11 少数: 備考:×10000
			//TODO:
			//result.setNenkinKingaku(ConverterUtility.convert(java.math.BigDecimal.class,Collection.get()));
		}
		{
			//FROM:画面データモデル:登録時のSYSDATEをセット 入力: key名: 型: 備考: 
			//TO:テーブル.テーブル:T_LRMS_2LF_JZSKN_NKJKM 論理:システム作成日時 物理:SYSTEM_CREATE_DATE 属性:Date 桁数:　 少数: 備考:
			//TODO:
			//result.setSystemCreateDate(ConverterUtility.convert(java.util.Date.class,登録時のSYSDATEをセットCollection.get()));
		}
		{
			//FROM:画面データモデル:登録時のSYSDATEをセット 入力: key名: 型: 備考: 
			//TO:テーブル.テーブル:T_LRMS_2LF_JZSKN_NKJKM 論理:システム更新日時 物理:SYSTEM_UPDATE_DATE 属性:Date 桁数:　 少数: 備考:
			//TODO:
			//result.setSystemUpdateDate(ConverterUtility.convert(java.util.Date.class,登録時のSYSDATEをセットCollection.get()));
		}

		return result;

	}

	/*
	 * データ変換処理：
	 * ＬＲＭＳセカンドライフ:T_LRMS_2LF_JZSKN_NKKNM
	 */
	static public TLrms2lfJzsknNkknm transferTLrms2LfJzsknNkknm(LtPlanCollection ltPlanCollection, LtPensionCollection ltPensionCollection){
		//パラメターのNULLチェック：	
		if( ltPlanCollection == null)
			ltPlanCollection =new LtPlanCollection ();
		if( ltPensionCollection == null)
			ltPensionCollection =new LtPensionCollection ();

		TLrms2lfJzsknNkknm result=new TLrms2lfJzsknNkknm();
		{
			//FROM:画面データモデル:LtPlan 入力:プランID key名:planId 型: 備考: このアプリ内で、ユニークなプランID（UUID形式）(DBテーブルの主キー）
			//TO:テーブル.テーブル:T_LRMS_2LF_JZSKN_NKKNM 論理:プランID 物理:PLAN_ID 属性:Varchar2 桁数:36 少数: 備考:
			//TODO:
			result.setPlanId(ConverterUtility.convert(String.class,ltPlanCollection.getPlanId()));
		}
		{
			//FROM:画面データモデル:LtPension 入力:家族No key名:familyNo 型: 備考: 
			//TO:テーブル.テーブル:T_LRMS_2LF_JZSKN_NKKNM 論理:家族コード（本人/配偶者） 物理:FAMILY_HONSPO_CD 属性:Char 桁数:2 少数: 備考:
			//TODO:
			result.setFamilyHonspoCd(ConverterUtility.convert(String.class,ltPensionCollection.getFamilyNo()));
		}
		{
			//FROM:画面データモデル:LtPension 入力:行番号 key名:rowNo 型: 備考: 
			//TO:テーブル.テーブル:T_LRMS_2LF_JZSKN_NKKNM 論理:SEQ 物理:SEQ 属性:Number 桁数:1 少数: 備考:
			//TODO:
			result.setSeq(ConverterUtility.convert(java.math.BigDecimal.class,ltPensionCollection.getRowNo()));
		}
		{
			//FROM:画面データモデル:LtPension 入力:年金タイプ key名:pensionType 型: 備考: 
			//TO:テーブル.テーブル:T_LRMS_2LF_JZSKN_NKKNM 論理:年金タイプコード 物理:NENKIN_TYPE_CD 属性:Char 桁数:1 少数: 備考:
			//TODO:
			result.setNenkinTypeCd(ConverterUtility.convert(String.class,ltPensionCollection.getPensionType()));
		}
		{
			//FROM:画面データモデル:LtPension 入力:開始年月 key名:jobStart 型: 備考: 
			//TO:テーブル.テーブル:T_LRMS_2LF_JZSKN_NKKNM 論理:開始年月 物理:START_NENGETSU 属性:Char 桁数:6 少数: 備考:
			//TODO:
			result.setStartNengetsu(ConverterUtility.convert(String.class,ltPensionCollection.getJobStart()));
		}
		{
			//FROM:画面データモデル:LtPension 入力:開始年齢 key名:jobStartAge 型: 備考: 
			//TO:テーブル.テーブル:T_LRMS_2LF_JZSKN_NKKNM 論理:開始年齢 物理:AGE_FROM 属性:Number 桁数:3 少数: 備考:
			//TODO:
			result.setAgeFrom(ConverterUtility.convert(java.math.BigDecimal.class,ltPensionCollection.getJobStartAge()));
		}
		{
			//FROM:画面データモデル:LtPension 入力:終了年月 key名:jobEnd 型: 備考: 
			//TO:テーブル.テーブル:T_LRMS_2LF_JZSKN_NKKNM 論理:終了年月 物理:END_NENGETSU 属性:Char 桁数:6 少数: 備考:
			//TODO:
			result.setEndNengetsu(ConverterUtility.convert(String.class,ltPensionCollection.getJobEnd()));
		}
		{
			//FROM:画面データモデル:LtPension 入力:終了年齢 key名:jobEndAge 型: 備考: 
			//TO:テーブル.テーブル:T_LRMS_2LF_JZSKN_NKKNM 論理:終了年齢 物理:AGE_TO 属性:Number 桁数:3 少数: 備考:
			//TODO:
			result.setAgeTo(ConverterUtility.convert(java.math.BigDecimal.class,ltPensionCollection.getJobEndAge()));
		}
		{
			//FROM:画面データモデル:LtPension 入力:加入月数 key名:entryMonth 型: 備考: 
			//TO:テーブル.テーブル:T_LRMS_2LF_JZSKN_NKKNM 論理:加入月数 物理:KANYU_TSUKISU 属性:Number 桁数:3 少数: 備考:
			//TODO:
			result.setKanyuTsukisu(ConverterUtility.convert(java.math.BigDecimal.class,ltPensionCollection.getEntryMonth()));
		}
		{
			//FROM:画面データモデル:LtPension 入力:年収 key名:income 型: 備考: 
			//TO:テーブル.テーブル:T_LRMS_2LF_JZSKN_NKKNM 論理:年収 物理:NENSHU 属性:Number 桁数:11 少数: 備考:×10000
			//TODO:
			result.setNenshu(ConverterUtility.convert(java.math.BigDecimal.class,ltPensionCollection.getIncome()));
		}
		{
			//FROM:画面データモデル:登録時のSYSDATEをセット 入力: key名: 型: 備考: 
			//TO:テーブル.テーブル:T_LRMS_2LF_JZSKN_NKKNM 論理:システム作成日時 物理:SYSTEM_CREATE_DATE 属性:Date 桁数:　 少数: 備考:
			//TODO:
			//result.setSystemCreateDate(ConverterUtility.convert(java.util.Date.class,登録時のSYSDATEをセットCollection.get()));
		}
		{
			//FROM:画面データモデル:登録時のSYSDATEをセット 入力: key名: 型: 備考: 
			//TO:テーブル.テーブル:T_LRMS_2LF_JZSKN_NKKNM 論理:システム更新日時 物理:SYSTEM_UPDATE_DATE 属性:Date 桁数:　 少数: 備考:
			//TODO:
			//result.setSystemUpdateDate(ConverterUtility.convert(java.util.Date.class,登録時のSYSDATEをセットCollection.get()));
		}

		return result;

	}

	/*
	 * データ変換処理：
	 * ＬＲＭＳセカンドライフ:T_LRMS_2LF_JZSKN_SHUNYU
	 */
	static public TLrms2lfJzsknShunyu transferTLrms2LfJzsknShunyu(LtPlanCollection ltPlanCollection, Lrsc030502Collection lrsc030502Collection){
		//パラメターのNULLチェック：	
		if( ltPlanCollection == null)
			ltPlanCollection =new LtPlanCollection ();
		if( lrsc030502Collection == null)
			lrsc030502Collection =new Lrsc030502Collection ();

		TLrms2lfJzsknShunyu result=new TLrms2lfJzsknShunyu();
		{
			//FROM:画面データモデル:LtPlan 入力:プランID key名:planId 型: 備考: このアプリ内で、ユニークなプランID（UUID形式）(DBテーブルの主キー）
			//TO:テーブル.テーブル:T_LRMS_2LF_JZSKN_SHUNYU 論理:プランID 物理:PLAN_ID 属性:Varchar2 桁数:36 少数: 備考:
			//TODO:
			result.setPlanId(ConverterUtility.convert(String.class,ltPlanCollection.getPlanId()));
		}
		{
			//FROM:画面データモデル:Lrsc030502 入力:世帯主配偶者識別フラグ key名:personSpouseFlg 型:CODE 備考: 1：世帯主、2：配偶者
			//TO:テーブル.テーブル:T_LRMS_2LF_JZSKN_SHUNYU 論理:家族コード（本人/配偶者） 物理:FAMILY_HONSPO_CD 属性:Char 桁数:2 少数: 備考:
			//TODO:
			result.setFamilyHonspoCd(ConverterUtility.convert(String.class,lrsc030502Collection.getPersonSpouseFlg()));
		}
		{
			//FROM:画面データモデル:Lrsc030502 入力:id key名:id 型:NUMBER 備考: 
			//TO:テーブル.テーブル:T_LRMS_2LF_JZSKN_SHUNYU 論理:SEQ 物理:SEQ 属性:Number 桁数:1 少数: 備考:
			//TODO:
			result.setSeq(ConverterUtility.convert(java.math.BigDecimal.class,lrsc030502Collection.getId()));
		}
		{
			//FROM:画面データモデル:Lrsc030502 入力:収入From年齢入力欄 key名:incomeStartAge 型:NUMBER 備考: 
			//TO:テーブル.テーブル:T_LRMS_2LF_JZSKN_SHUNYU 論理:年収開始年齢 物理:NENSHU_START_AGE 属性:Number 桁数:3 少数: 備考:
			//TODO:
			result.setNenshuStartAge(ConverterUtility.convert(java.math.BigDecimal.class,lrsc030502Collection.getIncomeStartAge()));
		}
		{
			//FROM:画面データモデル:Lrsc030502 入力:収入To年齢入力欄 key名:incomeEndAge 型:NUMBER 備考: 
			//TO:テーブル.テーブル:T_LRMS_2LF_JZSKN_SHUNYU 論理:年収終了年齢 物理:NENSHU_END_AGE 属性:Number 桁数:3 少数: 備考:
			//TODO:
			result.setNenshuEndAge(ConverterUtility.convert(java.math.BigDecimal.class,lrsc030502Collection.getIncomeEndAge()));
		}
		{
			//FROM:画面データモデル:Lrsc030502 入力:収入金額入力欄 key名:incomeAmount 型:NUMBER 備考: 
			//TO:テーブル.テーブル:T_LRMS_2LF_JZSKN_SHUNYU 論理:年収額 物理:NENSHU_GAKU 属性:Number 桁数:11 少数: 備考:×10000
			//TODO:
			result.setNenshuGaku(ConverterUtility.convert(java.math.BigDecimal.class,lrsc030502Collection.getIncomeAmount()));
		}
		{
			//FROM:画面データモデル:登録時のSYSDATEをセット 入力: key名: 型: 備考: 
			//TO:テーブル.テーブル:T_LRMS_2LF_JZSKN_SHUNYU 論理:システム作成日時 物理:SYSTEM_CREATE_DATE 属性:Date 桁数:　 少数: 備考:
			//TODO:
			//result.setSystemCreateDate(ConverterUtility.convert(java.util.Date.class,登録時のSYSDATEをセットCollection.get()));
		}
		{
			//FROM:画面データモデル:登録時のSYSDATEをセット 入力: key名: 型: 備考: 
			//TO:テーブル.テーブル:T_LRMS_2LF_JZSKN_SHUNYU 論理:システム更新日時 物理:SYSTEM_UPDATE_DATE 属性:Date 桁数:　 少数: 備考:
			//TODO:
			//result.setSystemUpdateDate(ConverterUtility.convert(java.util.Date.class,登録時のSYSDATEをセットCollection.get()));
		}

		return result;

	}

	/*
	 * データ変換処理：
	 * ＬＲＭＳセカンドライフ:T_LRMS_2LF_JZSKN_OTHER
	 */
	static public TLrms2lfJzsknOther transferTLrms2LfJzsknOther(LtPlanCollection ltPlanCollection, LRSC030503Collection lRSC030503Collection){
		//パラメターのNULLチェック：	
		if( ltPlanCollection == null)
			ltPlanCollection =new LtPlanCollection ();
		if( lRSC030503Collection == null)
			lRSC030503Collection =new LRSC030503Collection ();

		TLrms2lfJzsknOther result=new TLrms2lfJzsknOther();
		{
			//FROM:画面データモデル:LtPlan 入力:プランID key名:planId 型: 備考: このアプリ内で、ユニークなプランID（UUID形式）(DBテーブルの主キー）
			//TO:テーブル.テーブル:T_LRMS_2LF_JZSKN_OTHER 論理:プランID 物理:PLAN_ID 属性:Varchar2 桁数:36 少数: 備考:
			//TODO:
			result.setPlanId(ConverterUtility.convert(String.class,ltPlanCollection.getPlanId()));
		}
		{
			//FROM:画面データモデル:LRSC030503 入力:id key名:id 型:NUMBER 備考: 
			//TO:テーブル.テーブル:T_LRMS_2LF_JZSKN_OTHER 論理:SEQ 物理:SEQ 属性:Number 桁数:1 少数: 備考:
			//TODO:
			result.setSeq(ConverterUtility.convert(java.math.BigDecimal.class,lRSC030503Collection.getId()));
		}
		{
			//FROM:画面データモデル:LRSC030503 入力:その他収入内容 key名:otherContentName 型:CHAR 備考: 
			//TO:テーブル.テーブル:T_LRMS_2LF_JZSKN_OTHER 論理:その他収入名 物理:OTHER_SHUNYU_NAME 属性:Varchar2 桁数:10 少数: 備考:
			//TODO:
			result.setOtherShunyuName(ConverterUtility.convert(String.class,lRSC030503Collection.getOtherContentName()));
		}
		{
			//FROM:画面データモデル:LRSC030503 入力:その他収入受取開始年齢入力欄 key名:otherStartAge 型:NUMBER 備考: 
			//TO:テーブル.テーブル:T_LRMS_2LF_JZSKN_OTHER 論理:収入開始年齢 物理:SHUNYU_START_AGE 属性:Number 桁数:3 少数: 備考:
			//TODO:
			result.setShunyuStartAge(ConverterUtility.convert(java.math.BigDecimal.class,lRSC030503Collection.getOtherStartAge()));
		}
		{
			//FROM:画面データモデル:LRSC030503 入力:その他収入受取終了年齢入力欄 key名:otherEndAge 型:NUMBER 備考: 
			//TO:テーブル.テーブル:T_LRMS_2LF_JZSKN_OTHER 論理:収入終了年齢 物理:SHUNYU_END_AGE 属性:Number 桁数:3 少数: 備考:
			//TODO:
			result.setShunyuEndAge(ConverterUtility.convert(java.math.BigDecimal.class,lRSC030503Collection.getOtherEndAge()));
		}
		{
			//FROM:画面データモデル:LRSC030503 入力:その他収入金額入力欄 key名:otherAmount 型:NUMBER 備考: 
			//TO:テーブル.テーブル:T_LRMS_2LF_JZSKN_OTHER 論理:収入額 物理:SHUNYU_GAKU 属性:Number 桁数:11 少数: 備考:×10000
			//TODO:
			result.setShunyuGaku(ConverterUtility.convert(java.math.BigDecimal.class,lRSC030503Collection.getOtherAmount()));
		}
		{
			//FROM:画面データモデル:登録時のSYSDATEをセット 入力: key名: 型: 備考: 
			//TO:テーブル.テーブル:T_LRMS_2LF_JZSKN_OTHER 論理:システム作成日時 物理:SYSTEM_CREATE_DATE 属性:Date 桁数:　 少数: 備考:
			//TODO:
			//result.setSystemCreateDate(ConverterUtility.convert(java.util.Date.class,登録時のSYSDATEをセットCollection.get()));
		}
		{
			//FROM:画面データモデル:登録時のSYSDATEをセット 入力: key名: 型: 備考: 
			//TO:テーブル.テーブル:T_LRMS_2LF_JZSKN_OTHER 論理:システム更新日時 物理:SYSTEM_UPDATE_DATE 属性:Date 桁数:　 少数: 備考:
			//TODO:
			//result.setSystemUpdateDate(ConverterUtility.convert(java.util.Date.class,登録時のSYSDATEをセットCollection.get()));
		}

		return result;

	}

}
