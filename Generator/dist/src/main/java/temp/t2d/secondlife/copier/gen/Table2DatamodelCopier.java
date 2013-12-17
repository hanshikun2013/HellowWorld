package temp.t2d.secondlife.copier.gen;

import jp.co.axa.life.app.lt.util.ConverterUtility;
import jp.co.axa.life.app.lt.common.LtSvConst;
import jp.co.axa.life.app.lt.common.util.LtSvUtils;
import temp.t2d.secondlife.datamodel.gen.Lrsc0301Collection;
import temp.t2d.secondlife.datamodel.gen.Lrsc030201Collection;
import temp.t2d.secondlife.datamodel.gen.Lrsc030202Collection;
import temp.t2d.secondlife.datamodel.gen.Lrsc030203Collection;
import temp.t2d.secondlife.datamodel.gen.Lrsc030204Collection;
import temp.t2d.secondlife.datamodel.gen.Lrsc0304Collection;
import temp.t2d.secondlife.datamodel.gen.Lrsc030501Collection;
import temp.t2d.secondlife.datamodel.gen.Lrsc030502Collection;
import temp.t2d.secondlife.datamodel.gen.Lrsc030503Collection;
import temp.t2d.secondlife.datamodel.gen.Lrsc030701Collection;
import temp.t2d.secondlife.entity.gen.TLrms2lfKihon;
import temp.t2d.secondlife.entity.gen.TLrms2lfHysknLife;
import temp.t2d.secondlife.entity.gen.TLrms2lfHysknJutaku;
import temp.t2d.secondlife.entity.gen.TLrms2lfHysknEvent;
import temp.t2d.secondlife.entity.gen.TLrms2lfHysknOther;
import temp.t2d.secondlife.entity.gen.TLrms2lfJzsknNkjkm;
import temp.t2d.secondlife.entity.gen.TLrms2lfJzsknShunyu;
import temp.t2d.secondlife.entity.gen.TLrms2lfJzsknOther;


public  class Table2DatamodelCopier{


	/*
	 * データ変換処理：
	 * :Lrsc0301Collection
	 */
	static public Lrsc0301Collection transferLrsc0301Collection(TLrms2lfKihon tLrms2lfKihon){
		Lrsc0301Collection result=new Lrsc0301Collection();

		//FROM:テーブル:０をセット 論理: 物理: 属性: 桁数: 少数:  備考:
		//TO:画面データモデル: Lrsc0301 入力:id key名:id 型:NUMBER 備考: 
		//TODO:
		//result.setId(ConverterUtility.convert(java.math.BigDecimal.class,０をセット.get()));

		//FROM:テーブル:T_LRMS_2LF_KIHON 論理:必要資金 生活費 物理:HYSKN_LIFE 属性:Number 桁数:11 少数:  備考:
		//TO:画面データモデル: Lrsc0301 入力:生活費（月額・円） key名:livingCost 型:NUMBER 備考: 単位：円
		//TODO:
		result.setLivingCost(ConverterUtility.convert(java.math.BigDecimal.class,tLrms2lfKihon.getHysknLife()));

		//FROM:テーブル:※項目セット無し　(画面にて算出) 論理: 物理: 属性: 桁数: 少数:  備考:
		//TO:画面データモデル: Lrsc0301 入力:住宅費（月額・円） key名:house 型:NUMBER 備考: 単位：円
		//TODO:
		//result.setHouse(ConverterUtility.convert(java.math.BigDecimal.class,※項目セット無し　(画面にて算出).get()));

		//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数:  備考:
		//TO:画面データモデル: Lrsc0301 入力:趣味イベント（円） key名:hobby 型:NUMBER 備考: 単位：円
		//TODO:
		//result.setHobby(ConverterUtility.convert(java.math.BigDecimal.class,.get()));

		//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数:  備考:
		//TO:画面データモデル: Lrsc0301 入力:その他必要資金（円） key名:other 型:NUMBER 備考: 単位：円
		//TODO:
		//result.setOther(ConverterUtility.convert(java.math.BigDecimal.class,.get()));

		//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数:  備考:
		//TO:画面データモデル: Lrsc0301 入力:必要資金総額（万円） key名:needFunds 型:NUMBER 備考: 単位：万円
		//TODO:
		//result.setNeedFunds(ConverterUtility.convert(java.math.BigDecimal.class,.get()));

		//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数:  備考:
		//TO:画面データモデル: Lrsc0301 入力:累計の年次データ key名: 型: 備考: 
		//TODO:
		//result.set(ConverterUtility.convert(String.class,.get()));

		//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数:  備考:
		//TO:画面データモデル: Lrsc0301 入力:　生活費 key名:annualTotalLivingCostList 型:NUMBER[] 備考: 単位：万円
		//TODO:
		//result.setAnnualTotalLivingCostList(ConverterUtility.convert(java.math.BigDecimal[].class,.get()));

		//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数:  備考:
		//TO:画面データモデル: Lrsc0301 入力:　住宅費 key名:annualTotalHouseList 型:NUMBER[] 備考: 単位：万円
		//TODO:
		//result.setAnnualTotalHouseList(ConverterUtility.convert(java.math.BigDecimal[].class,.get()));

		//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数:  備考:
		//TO:画面データモデル: Lrsc0301 入力:　趣味イベント key名:annualTotalHobbyList 型:NUMBER[] 備考: 単位：万円
		//TODO:
		//result.setAnnualTotalHobbyList(ConverterUtility.convert(java.math.BigDecimal[].class,.get()));

		//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数:  備考:
		//TO:画面データモデル: Lrsc0301 入力:　その他必要資金 key名:annualTotalOtherList 型:NUMBER[] 備考: 単位：万円
		//TODO:
		//result.setAnnualTotalOtherList(ConverterUtility.convert(java.math.BigDecimal[].class,.get()));

		//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数:  備考:
		//TO:画面データモデル: Lrsc0301 入力:　総額 key名:annualTotalTotalList 型:NUMBER[] 備考: 単位：万円
		//TODO:
		//result.setAnnualTotalTotalList(ConverterUtility.convert(java.math.BigDecimal[].class,.get()));

		//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数:  備考:
		//TO:画面データモデル: Lrsc0301 入力:年度別の年次データ key名: 型: 備考: 
		//TODO:
		//result.set(ConverterUtility.convert(String.class,.get()));

		//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数:  備考:
		//TO:画面データモデル: Lrsc0301 入力:　生活費 key名:annualYearLivingCostList 型:NUMBER[] 備考: 単位：万円
		//TODO:
		//result.setAnnualYearLivingCostList(ConverterUtility.convert(java.math.BigDecimal[].class,.get()));

		//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数:  備考:
		//TO:画面データモデル: Lrsc0301 入力:　住宅費 key名:annualYearHouseList 型:NUMBER[] 備考: 単位：万円
		//TODO:
		//result.setAnnualYearHouseList(ConverterUtility.convert(java.math.BigDecimal[].class,.get()));

		//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数:  備考:
		//TO:画面データモデル: Lrsc0301 入力:　趣味イベント key名:annualYearHobbyList 型:NUMBER[] 備考: 単位：万円
		//TODO:
		//result.setAnnualYearHobbyList(ConverterUtility.convert(java.math.BigDecimal[].class,.get()));

		//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数:  備考:
		//TO:画面データモデル: Lrsc0301 入力:　その他必要資金 key名:annualYearOtherList 型:NUMBER[] 備考: 単位：万円
		//TODO:
		//result.setAnnualYearOtherList(ConverterUtility.convert(java.math.BigDecimal[].class,.get()));

		//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数:  備考:
		//TO:画面データモデル: Lrsc0301 入力:　総額 key名:annualYearTotalList 型:NUMBER[] 備考: 単位：万円
		//TODO:
		//result.setAnnualYearTotalList(ConverterUtility.convert(java.math.BigDecimal[].class,.get()));

		//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数:  備考:
		//TO:画面データモデル: Lrsc0301 入力:配偶者有無 key名:dummySpFlg 型:CODE 備考: ダミーデータ、保存不要
		//TODO:
		//result.setDummySpFlg(ConverterUtility.convert(String.class,.get()));

		//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数:  備考:
		//TO:画面データモデル: Lrsc0301 入力:世帯主年齢 key名:dummyHhAge 型:NUMBER 備考: ダミーデータ、保存不要
		//TODO:
		//result.setDummyHhAge(ConverterUtility.convert(java.math.BigDecimal.class,.get()));

		//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数:  備考:
		//TO:画面データモデル: Lrsc0301 入力:世帯主性別 key名:dummyHhSex 型:NUMBER 備考: ダミーデータ、保存不要
		//TODO:
		//result.setDummyHhSex(ConverterUtility.convert(java.math.BigDecimal.class,.get()));

		//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数:  備考:
		//TO:画面データモデル: Lrsc0301 入力:世帯主生年月日 key名:dummyHhBirth 型:NUMBER 備考: ダミーデータ、保存不要
		//TODO:
		//result.setDummyHhBirth(ConverterUtility.convert(java.math.BigDecimal.class,.get()));

		//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数:  備考:
		//TO:画面データモデル: Lrsc0301 入力:世帯主年金種別 key名:dummyHhPensionType 型:NUMBER 備考: ダミーデータ、保存不要
		//TODO:
		//result.setDummyHhPensionType(ConverterUtility.convert(java.math.BigDecimal.class,.get()));

		//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数:  備考:
		//TO:画面データモデル: Lrsc0301 入力:世帯主退職予定年齢 key名:dummyHhRetirementAge 型:NUMBER 備考: ダミーデータ、保存不要
		//TODO:
		//result.setDummyHhRetirementAge(ConverterUtility.convert(java.math.BigDecimal.class,.get()));

		//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数:  備考:
		//TO:画面データモデル: Lrsc0301 入力:世帯主仕事開始年月 key名:dummyHhJobStartYM 型:NUMBER 備考: ダミーデータ、保存不要
		//TODO:
		//result.setDummyHhJobStartYM(ConverterUtility.convert(java.math.BigDecimal.class,.get()));

		//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数:  備考:
		//TO:画面データモデル: Lrsc0301 入力:世帯主仕事終了年月 key名:dummyHhJobEndYM 型:NUMBER 備考: ダミーデータ、保存不要
		//TODO:
		//result.setDummyHhJobEndYM(ConverterUtility.convert(java.math.BigDecimal.class,.get()));

		//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数:  備考:
		//TO:画面データモデル: Lrsc0301 入力:世帯主年収 key名:dummyHhIncome 型:NUMBER 備考: ダミーデータ、保存不要
		//TODO:
		//result.setDummyHhIncome(ConverterUtility.convert(java.math.BigDecimal.class,.get()));

		//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数:  備考:
		//TO:画面データモデル: Lrsc0301 入力:世帯主平均寿命 key名:dummyHhAverageLengthOfLife 型:NUMBER 備考: ダミーデータ、保存不要
		//TODO:
		//result.setDummyHhAverageLengthOfLife(ConverterUtility.convert(java.math.BigDecimal.class,.get()));

		//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数:  備考:
		//TO:画面データモデル: Lrsc0301 入力:配偶者年齢 key名:dummySpAge 型:NUMBER 備考: ダミーデータ、保存不要
		//TODO:
		//result.setDummySpAge(ConverterUtility.convert(java.math.BigDecimal.class,.get()));

		//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数:  備考:
		//TO:画面データモデル: Lrsc0301 入力:配偶者性別 key名:dummySpSex 型:NUMBER 備考: ダミーデータ、保存不要
		//TODO:
		//result.setDummySpSex(ConverterUtility.convert(java.math.BigDecimal.class,.get()));

		//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数:  備考:
		//TO:画面データモデル: Lrsc0301 入力:配偶者生年月日 key名:dummySpBirth 型:NUMBER 備考: ダミーデータ、保存不要
		//TODO:
		//result.setDummySpBirth(ConverterUtility.convert(java.math.BigDecimal.class,.get()));

		//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数:  備考:
		//TO:画面データモデル: Lrsc0301 入力:配偶者年金種別 key名:dummySpPensionType 型:NUMBER 備考: ダミーデータ、保存不要
		//TODO:
		//result.setDummySpPensionType(ConverterUtility.convert(java.math.BigDecimal.class,.get()));

		//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数:  備考:
		//TO:画面データモデル: Lrsc0301 入力:配偶者退職予定年齢 key名:dummySpRetirementAge 型:NUMBER 備考: ダミーデータ、保存不要
		//TODO:
		//result.setDummySpRetirementAge(ConverterUtility.convert(java.math.BigDecimal.class,.get()));

		//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数:  備考:
		//TO:画面データモデル: Lrsc0301 入力:配偶者仕事開始年月 key名:dummySpJobStartYM 型:NUMBER 備考: ダミーデータ、保存不要
		//TODO:
		//result.setDummySpJobStartYM(ConverterUtility.convert(java.math.BigDecimal.class,.get()));

		//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数:  備考:
		//TO:画面データモデル: Lrsc0301 入力:配偶者仕事終了年月 key名:dummySpJobEndYM 型:NUMBER 備考: ダミーデータ、保存不要
		//TODO:
		//result.setDummySpJobEndYM(ConverterUtility.convert(java.math.BigDecimal.class,.get()));

		//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数:  備考:
		//TO:画面データモデル: Lrsc0301 入力:配偶者年収 key名:dummySpIncome 型:NUMBER 備考: ダミーデータ、保存不要
		//TODO:
		//result.setDummySpIncome(ConverterUtility.convert(java.math.BigDecimal.class,.get()));

		//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数:  備考:
		//TO:画面データモデル: Lrsc0301 入力:配偶者平均寿命 key名:dummySpAverageLengthOfLife 型:NUMBER 備考: ダミーデータ、保存不要
		//TODO:
		//result.setDummySpAverageLengthOfLife(ConverterUtility.convert(java.math.BigDecimal.class,.get()));

		//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数:  備考:
		//TO:画面データモデル: Lrsc0301 入力:セカンドライフ開始年齢 key名:dummySecondLifeFromAge 型:NUMBER 備考: ダミーデータ、保存不要
		//TODO:
		//result.setDummySecondLifeFromAge(ConverterUtility.convert(java.math.BigDecimal.class,.get()));

		//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数:  備考:
		//TO:画面データモデル: Lrsc0301 入力:セカンドライフ終了年齢 key名:dummySecondLifeToAge 型:NUMBER 備考: ダミーデータ、保存不要
		//TODO:
		//result.setDummySecondLifeToAge(ConverterUtility.convert(java.math.BigDecimal.class,.get()));

		return result;

	}

	/*
	 * データ変換処理：
	 * :Lrsc030201Collection
	 */
	static public Lrsc030201Collection transferLrsc030201Collection(TLrms2lfHysknLife tLrms2lfHysknLife){
		Lrsc030201Collection result=new Lrsc030201Collection();

		//FROM:テーブル:T_LRMS_2LF_HYSKN_LIFE 論理: 物理: 属性: 桁数: 少数:  備考:
		//TO:画面データモデル: Lrsc030201 入力:id key名:id 型:NUMBER 備考: 
		//TODO:
		//result.setId(ConverterUtility.convert(java.math.BigDecimal.class,tLrms2lfHysknLife.get()));

		//FROM:テーブル:LRMSセカンドライフ必要資金生活費 論理: 物理: 属性: 桁数: 少数:  備考:
		//TO:画面データモデル: Lrsc030201 入力:入力方法 key名:inputMethod 型:CODE 備考: 1：総額を入力、2：詳細を入力
		//TODO:
		//result.setInputMethod(ConverterUtility.convert(String.class,lrmsセカンドライフ必要資金生活費.get()));

		//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数:  備考:
		//TO:画面データモデル: Lrsc030201 入力:生活費総額 key名:livingCostTotal 型:NUMBER 備考: 
		//TODO:
		//result.setLivingCostTotal(ConverterUtility.convert(java.math.BigDecimal.class,.get()));

		//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数:  備考:
		//TO:画面データモデル: Lrsc030201 入力:生活費コードリスト key名:livingCostCodeList 型:CODE[] 備考: 
		//TODO:
		//result.setLivingCostCodeList(ConverterUtility.convert(String[].class,.get()));

		//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数:  備考:
		//TO:画面データモデル: Lrsc030201 入力:生活費名リスト key名:livingCostNameList 型:CHAR[] 備考: 
		//TODO:
		//result.setLivingCostNameList(ConverterUtility.convert(String[].class,.get()));

		//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数:  備考:
		//TO:画面データモデル: Lrsc030201 入力:生活費 key名:livingCostList 型:NUMBER[] 備考: 
		//TODO:
		//result.setLivingCostList(ConverterUtility.convert(java.math.BigDecimal[].class,.get()));

		return result;

	}

	/*
	 * データ変換処理：
	 * :Lrsc030202Collection
	 */
	static public Lrsc030202Collection transferLrsc030202Collection(TLrms2lfHysknJutaku tLrms2lfHysknJutaku){
		Lrsc030202Collection result=new Lrsc030202Collection();

		//FROM:テーブル:０をセット 論理: 物理: 属性: 桁数: 少数:  備考:
		//TO:画面データモデル: Lrsc030202 入力:id key名:id 型:NUMBER 備考: 
		//TODO:
		//result.setId(ConverterUtility.convert(java.math.BigDecimal.class,０をセット.get()));

		//FROM:テーブル:T_LRMS_2LF_HYSKN_JUTAKU 論理:現在住居コード 物理:GENZAI_JUKYO_CD 属性:Char 桁数:1 少数:  備考:
		//TO:画面データモデル: Lrsc030202 入力:住宅区分 key名:radioHouseKbn 型:CODE 備考: 
		//TODO:
		result.setRadioHouseKbn(ConverterUtility.convert(String.class,tLrms2lfHysknJutaku.getGenzaiJukyoCd()));

		//FROM:テーブル:T_LRMS_2LF_HYSKN_JUTAKU 論理:現在家賃 物理:GENZAI_YACHIN 属性:Number 桁数:11 少数:  備考:
		//TO:画面データモデル: Lrsc030202 入力:現在家賃 key名:currentRent 型:NUMBER 備考: 
		//TODO:
		result.setCurrentRent(ConverterUtility.convert(java.math.BigDecimal.class,tLrms2lfHysknJutaku.getGenzaiYachin()));

		//FROM:テーブル:T_LRMS_2LF_HYSKN_JUTAKU 論理:月額返済額 物理:GETSUGAKU_HENSAIGAKU 属性:Number 桁数:11 少数:  備考:
		//TO:画面データモデル: Lrsc030202 入力:返済額 key名:amountRepaid 型:NUMBER 備考: 
		//TODO:
		result.setAmountRepaid(ConverterUtility.convert(java.math.BigDecimal.class,tLrms2lfHysknJutaku.getGetsugakuHensaigaku()));

		//FROM:テーブル:T_LRMS_2LF_HYSKN_JUTAKU 論理:返済期間 物理:HENSAI_KIKAN 属性:Number 桁数:2 少数:  備考:
		//TO:画面データモデル: Lrsc030202 入力:残返済期間 key名:remainingDuration 型:NUMBER 備考: 
		//TODO:
		result.setRemainingDuration(ConverterUtility.convert(java.math.BigDecimal.class,tLrms2lfHysknJutaku.getHensaiKikan()));

		//FROM:テーブル:M_CONSULTING
マスタ情報 論理:条件[コードID=CM09、コード値=現在住居コード]で、[値1]を取得 物理: 属性: 桁数: 少数:  備考:
		//TO:画面データモデル: Lrsc030202 入力:住宅区分名 key名:radioHouseKbnName 型:CHAR 備考: 
		//TODO:
		//result.setRadioHouseKbnName(ConverterUtility.convert(String.class,mConsulting
マスタ情報.get()));

		return result;

	}

	/*
	 * データ変換処理：
	 * :Lrsc030203Collection
	 */
	static public Lrsc030203Collection transferLrsc030203Collection(TLrms2lfHysknEvent tLrms2lfHysknEvent){
		Lrsc030203Collection result=new Lrsc030203Collection();

		//FROM:テーブル:T_LRMS_2LF_HYSKN_EVENT 論理:SEQ 物理:SEQ 属性:Number 桁数:1 少数:  備考:
		//TO:画面データモデル: Lrsc030203 入力:id key名:id 型:NUMBER 備考: 
		//TODO:
		result.setId(ConverterUtility.convert(java.math.BigDecimal.class,tLrms2lfHysknEvent.getSeq()));

		//FROM:テーブル:T_LRMS_2LF_HYSKN_EVENT 論理:必要資金（趣味・イベント）名 物理:HYSKN_EVENT_NAME 属性:Varchar2 桁数:10 少数:  備考:
		//TO:画面データモデル: Lrsc030203 入力:趣味イベント名 key名:hobbyName 型:CHAR 備考: 
		//TODO:
		result.setHobbyName(ConverterUtility.convert(String.class,tLrms2lfHysknEvent.getHysknEventName()));

		//FROM:テーブル:T_LRMS_2LF_HYSKN_EVENT 論理:趣味・イベント 開始年齢 物理:EVENT_START_AGE 属性:Number 桁数:3 少数:  備考:
		//TO:画面データモデル: Lrsc030203 入力:趣味イベント利用開始年齢 key名:hobbyStartAge 型:NUMBER 備考: 
		//TODO:
		result.setHobbyStartAge(ConverterUtility.convert(java.math.BigDecimal.class,tLrms2lfHysknEvent.getEventStartAge()));

		//FROM:テーブル:T_LRMS_2LF_HYSKN_EVENT 論理:趣味・イベント 終了年齢 物理:EVENT_END_AGE 属性:Number 桁数:3 少数:  備考:
		//TO:画面データモデル: Lrsc030203 入力:趣味イベント利用終了年齢 key名:hobbyEndAge 型:NUMBER 備考: 
		//TODO:
		result.setHobbyEndAge(ConverterUtility.convert(java.math.BigDecimal.class,tLrms2lfHysknEvent.getEventEndAge()));

		//FROM:テーブル:T_LRMS_2LF_HYSKN_EVENT 論理:趣味・イベント 周期 物理:EVENT_SYUKI 属性:Number 桁数:2 少数:  備考:
		//TO:画面データモデル: Lrsc030203 入力:趣味イベント利用頻度 key名:hobbyInterval 型:NUMBER 備考: 
		//TODO:
		result.setHobbyInterval(ConverterUtility.convert(java.math.BigDecimal.class,tLrms2lfHysknEvent.getEventSyuki()));

		//FROM:テーブル:T_LRMS_2LF_HYSKN_EVENT 論理:趣味・イベント 必要金額 物理:EVENT_HITSUYO_KINGAKU 属性:Number 桁数:11 少数:  備考:
		//TO:画面データモデル: Lrsc030203 入力:趣味イベント費用 key名:hobbyCost 型:NUMBER 備考: ÷10000
		//TODO:
		result.setHobbyCost(LtSvUtils.divide(ConverterUtility.convert(java.math.BigDecimal.class,tLrms2lfHysknEvent.getEventHitsuyoKingaku()),LtSvConst.TEN_THOUSAND));

		//FROM:テーブル:※項目セット無し　(画面にて算出) 論理: 物理: 属性: 桁数: 少数:  備考:
		//TO:画面データモデル: Lrsc030203 入力:趣味イベントコード key名:hobbyCode 型:CODE 備考: 
		//TODO:
		//result.setHobbyCode(ConverterUtility.convert(String.class,※項目セット無し　(画面にて算出).get()));

		return result;

	}

	/*
	 * データ変換処理：
	 * :Lrsc030204Collection
	 */
	static public Lrsc030204Collection transferLrsc030204Collection(TLrms2lfHysknOther tLrms2lfHysknOther){
		Lrsc030204Collection result=new Lrsc030204Collection();

		//FROM:テーブル:T_LRMS_2LF_HYSKN_OTHER 論理:SEQ 物理:SEQ 属性:Number 桁数:1 少数:  備考:
		//TO:画面データモデル: Lrsc030204 入力:id key名:id 型:NUMBER 備考: 
		//TODO:
		result.setId(ConverterUtility.convert(java.math.BigDecimal.class,tLrms2lfHysknOther.getSeq()));

		//FROM:テーブル:T_LRMS_2LF_HYSKN_OTHER 論理:必要資金（その他）名 物理:HYSKN_OTHER_NAME 属性:Varchar2 桁数:10 少数:  備考:
		//TO:画面データモデル: Lrsc030204 入力:その他必要資金購入品名 key名:otherName 型:CHAR 備考: 
		//TODO:
		result.setOtherName(ConverterUtility.convert(String.class,tLrms2lfHysknOther.getHysknOtherName()));

		//FROM:テーブル:T_LRMS_2LF_HYSKN_OTHER 論理:その他必要 開始年齢 物理:OTHER_HITSUYO_START_AGE 属性:Number 桁数:3 少数:  備考:
		//TO:画面データモデル: Lrsc030204 入力:その他必要資金利用開始年齢 key名:otherStartAge 型:NUMBER 備考: 
		//TODO:
		result.setOtherStartAge(ConverterUtility.convert(java.math.BigDecimal.class,tLrms2lfHysknOther.getOtherHitsuyoStartAge()));

		//FROM:テーブル:T_LRMS_2LF_HYSKN_OTHER 論理:その他必要 終了年齢 物理:OTHER_HITSUYO_END_AGE 属性:Number 桁数:3 少数:  備考:
		//TO:画面データモデル: Lrsc030204 入力:その他必要資金利用終了年齢 key名:otherEndAge 型:NUMBER 備考: 
		//TODO:
		result.setOtherEndAge(ConverterUtility.convert(java.math.BigDecimal.class,tLrms2lfHysknOther.getOtherHitsuyoEndAge()));

		//FROM:テーブル:T_LRMS_2LF_HYSKN_OTHER 論理:その他必要 周期 物理:OTHER_HITSUYO_SYUKI 属性:Number 桁数:2 少数:  備考:
		//TO:画面データモデル: Lrsc030204 入力:その他必要資金利用頻度 key名:otherInterval 型:NUMBER 備考: 
		//TODO:
		result.setOtherInterval(ConverterUtility.convert(java.math.BigDecimal.class,tLrms2lfHysknOther.getOtherHitsuyoSyuki()));

		//FROM:テーブル:T_LRMS_2LF_HYSKN_OTHER 論理:その他必要 金額 物理:OTHER_HITSUYO_KINGAKU 属性:Number 桁数:11 少数:  備考:
		//TO:画面データモデル: Lrsc030204 入力:その他必要資金購入予定金額 key名:otherCost 型:NUMBER 備考: ÷10000
		//TODO:
		result.setOtherCost(LtSvUtils.divide(ConverterUtility.convert(java.math.BigDecimal.class,tLrms2lfHysknOther.getOtherHitsuyoKingaku()),LtSvConst.TEN_THOUSAND));

		//FROM:テーブル:※項目セット無し　(画面にて算出) 論理: 物理: 属性: 桁数: 少数:  備考:
		//TO:画面データモデル: Lrsc030204 入力:その他必要資金購入品コード key名:otherCode 型:CODE 備考: 
		//TODO:
		//result.setOtherCode(ConverterUtility.convert(String.class,※項目セット無し　(画面にて算出).get()));

		return result;

	}

	/*
	 * データ変換処理：
	 * :Lrsc0304Collection
	 */
	static public Lrsc0304Collection transferLrsc0304Collection(TLrms2lfKihon tLrms2lfKihon){
		Lrsc0304Collection result=new Lrsc0304Collection();

		//FROM:テーブル:０をセット 論理: 物理: 属性: 桁数: 少数:  備考:
		//TO:画面データモデル: Lrsc0304 入力:id key名:id 型:NUMBER 備考: 
		//TODO:
		//result.setId(ConverterUtility.convert(java.math.BigDecimal.class,０をセット.get()));

		//FROM:テーブル:T_LRMS_2LF_KIHON 論理:準備済資金 退職金（主） 物理:JZSKN_TAISHOKUKIN_MAIN 属性:Number 桁数:11 少数:  備考:
		//TO:画面データモデル: Lrsc0304 入力:世帯主退職金 key名:retirementMoneyHh 型:NUMBER 備考: ÷10000
		//TODO:
		result.setRetirementMoneyHh(LtSvUtils.divide(ConverterUtility.convert(java.math.BigDecimal.class,tLrms2lfKihon.getJzsknTaishokukinMain()),LtSvConst.TEN_THOUSAND));

		//FROM:テーブル:T_LRMS_2LF_KIHON 論理:準備済資金 退職金（配） 物理:JZSKN_TAISHOKUKIN_SP 属性:Number 桁数:11 少数:  備考:
		//TO:画面データモデル: Lrsc0304 入力:配偶者退職金 key名:retirementMoneySp 型:NUMBER 備考: ÷10000
		//TODO:
		result.setRetirementMoneySp(LtSvUtils.divide(ConverterUtility.convert(java.math.BigDecimal.class,tLrms2lfKihon.getJzsknTaishokukinSp()),LtSvConst.TEN_THOUSAND));

		//FROM:テーブル:T_LRMS_2LF_KIHON 論理:準備済資金 預貯金 物理:JZSKN_YOCHOKIN 属性:Number 桁数:11 少数:  備考:
		//TO:画面データモデル: Lrsc0304 入力:預貯金 key名:deposit 型:NUMBER 備考: ÷10000
		//TODO:
		result.setDeposit(LtSvUtils.divide(ConverterUtility.convert(java.math.BigDecimal.class,tLrms2lfKihon.getJzsknYochokin()),LtSvConst.TEN_THOUSAND));

		//FROM:テーブル:T_LRMS_2LF_KIHON 論理:準備済資金 収入（主） 物理:JZSKN_SHUNYU_MAIN 属性:Number 桁数:11 少数:  備考:
		//TO:画面データモデル: Lrsc0304 入力:世帯主収入 key名:incomeHh 型:NUMBER 備考: ÷10000
		//TODO:
		result.setIncomeHh(LtSvUtils.divide(ConverterUtility.convert(java.math.BigDecimal.class,tLrms2lfKihon.getJzsknShunyuMain()),LtSvConst.TEN_THOUSAND));

		//FROM:テーブル:T_LRMS_2LF_KIHON 論理:準備済資金 収入（配） 物理:JZSKN_SHUNYU_SP 属性:Number 桁数:11 少数:  備考:
		//TO:画面データモデル: Lrsc0304 入力:配偶者収入 key名:incomeSp 型:NUMBER 備考: ÷10000
		//TODO:
		result.setIncomeSp(LtSvUtils.divide(ConverterUtility.convert(java.math.BigDecimal.class,tLrms2lfKihon.getJzsknShunyuSp()),LtSvConst.TEN_THOUSAND));

		//FROM:テーブル:T_LRMS_2LF_KIHON 論理:準備済資金 その他 物理:JZSKN_OTHER 属性:Number 桁数:11 少数:  備考:
		//TO:画面データモデル: Lrsc0304 入力:その他収入 key名:otherIncome 型:NUMBER 備考: ÷10000
		//TODO:
		result.setOtherIncome(LtSvUtils.divide(ConverterUtility.convert(java.math.BigDecimal.class,tLrms2lfKihon.getJzsknOther()),LtSvConst.TEN_THOUSAND));

		//FROM:テーブル:※項目セット無し　(画面にて算出) 論理: 物理: 属性: 桁数: 少数:  備考:
		//TO:画面データモデル: Lrsc0304 入力:世帯主公的年金 key名:pensionHh 型:NUMBER 備考: 
		//TODO:
		//result.setPensionHh(ConverterUtility.convert(java.math.BigDecimal.class,※項目セット無し　(画面にて算出).get()));

		//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数:  備考:
		//TO:画面データモデル: Lrsc0304 入力:配偶者公的年金 key名:pensionSp 型:NUMBER 備考: 
		//TODO:
		//result.setPensionSp(ConverterUtility.convert(java.math.BigDecimal.class,.get()));

		//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数:  備考:
		//TO:画面データモデル: Lrsc0304 入力:準備済資金総額 key名:preparedFunds 型:NUMBER 備考: 
		//TODO:
		//result.setPreparedFunds(ConverterUtility.convert(java.math.BigDecimal.class,.get()));

		//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数:  備考:
		//TO:画面データモデル: Lrsc0304 入力:世帯主・配偶者共通の累計の年次データ key名: 型: 備考: 
		//TODO:
		//result.set(ConverterUtility.convert(String.class,.get()));

		//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数:  備考:
		//TO:画面データモデル: Lrsc0304 入力:　公的年金 key名:annualTotalPensionList 型:NUMBER[] 備考: 
		//TODO:
		//result.setAnnualTotalPensionList(ConverterUtility.convert(java.math.BigDecimal[].class,.get()));

		//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数:  備考:
		//TO:画面データモデル: Lrsc0304 入力:　収入 key名:annualTotalIncomeList 型:NUMBER[] 備考: 
		//TODO:
		//result.setAnnualTotalIncomeList(ConverterUtility.convert(java.math.BigDecimal[].class,.get()));

		//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数:  備考:
		//TO:画面データモデル: Lrsc0304 入力:　その他収入 key名:annualTotalOtherIncomeList 型:NUMBER[] 備考: 
		//TODO:
		//result.setAnnualTotalOtherIncomeList(ConverterUtility.convert(java.math.BigDecimal[].class,.get()));

		//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数:  備考:
		//TO:画面データモデル: Lrsc0304 入力:　収入・その他収入 key名:annualTotalIncomeAndOtherIncomeList 型:NUMBER[] 備考: 
		//TODO:
		//result.setAnnualTotalIncomeAndOtherIncomeList(ConverterUtility.convert(java.math.BigDecimal[].class,.get()));

		//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数:  備考:
		//TO:画面データモデル: Lrsc0304 入力:　総額 key名:annualTotalTotalList 型:NUMBER[] 備考: 
		//TODO:
		//result.setAnnualTotalTotalList(ConverterUtility.convert(java.math.BigDecimal[].class,.get()));

		//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数:  備考:
		//TO:画面データモデル: Lrsc0304 入力:世帯主・配偶者共通の年度別の年次データ key名: 型: 備考: 
		//TODO:
		//result.set(ConverterUtility.convert(String.class,.get()));

		//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数:  備考:
		//TO:画面データモデル: Lrsc0304 入力:　公的年金 key名:annualYearPensionList 型:NUMBER[] 備考: 
		//TODO:
		//result.setAnnualYearPensionList(ConverterUtility.convert(java.math.BigDecimal[].class,.get()));

		//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数:  備考:
		//TO:画面データモデル: Lrsc0304 入力:　収入 key名:annualYearIncomeList 型:NUMBER[] 備考: 
		//TODO:
		//result.setAnnualYearIncomeList(ConverterUtility.convert(java.math.BigDecimal[].class,.get()));

		//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数:  備考:
		//TO:画面データモデル: Lrsc0304 入力:　その他収入 key名:annualYearOtherIncomeList 型:NUMBER[] 備考: 
		//TODO:
		//result.setAnnualYearOtherIncomeList(ConverterUtility.convert(java.math.BigDecimal[].class,.get()));

		//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数:  備考:
		//TO:画面データモデル: Lrsc0304 入力:　収入・その他収入 key名:annualYearIncomeAndOtherIncomeList 型:NUMBER[] 備考: 
		//TODO:
		//result.setAnnualYearIncomeAndOtherIncomeList(ConverterUtility.convert(java.math.BigDecimal[].class,.get()));

		//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数:  備考:
		//TO:画面データモデル: Lrsc0304 入力:　総額 key名:annualYearTotalList 型:NUMBER[] 備考: 
		//TODO:
		//result.setAnnualYearTotalList(ConverterUtility.convert(java.math.BigDecimal[].class,.get()));

		//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数:  備考:
		//TO:画面データモデル: Lrsc0304 入力:世帯主の年齢リスト key名:hhAgeList 型:NUMBER[] 備考: 
		//TODO:
		//result.setHhAgeList(ConverterUtility.convert(java.math.BigDecimal[].class,.get()));

		//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数:  備考:
		//TO:画面データモデル: Lrsc0304 入力:世帯主の西暦リスト key名:hhAdList 型:NUMBER[] 備考: 
		//TODO:
		//result.setHhAdList(ConverterUtility.convert(java.math.BigDecimal[].class,.get()));

		//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数:  備考:
		//TO:画面データモデル: Lrsc0304 入力:世帯主の累計の年次データ key名: 型: 備考: 
		//TODO:
		//result.set(ConverterUtility.convert(String.class,.get()));

		//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数:  備考:
		//TO:画面データモデル: Lrsc0304 入力:　公的年金 key名:hhAnnualTotalPensionList 型:NUMBER[] 備考: 
		//TODO:
		//result.setHhAnnualTotalPensionList(ConverterUtility.convert(java.math.BigDecimal[].class,.get()));

		//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数:  備考:
		//TO:画面データモデル: Lrsc0304 入力:　世帯主収入 key名:hhAnnualTotalIncomeList 型:NUMBER[] 備考: 
		//TODO:
		//result.setHhAnnualTotalIncomeList(ConverterUtility.convert(java.math.BigDecimal[].class,.get()));

		//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数:  備考:
		//TO:画面データモデル: Lrsc0304 入力:世帯主の年度別の年次データ key名: 型: 備考: 
		//TODO:
		//result.set(ConverterUtility.convert(String.class,.get()));

		//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数:  備考:
		//TO:画面データモデル: Lrsc0304 入力:　公的年金 key名:hhAnnualYearPensionList 型:NUMBER[] 備考: 
		//TODO:
		//result.setHhAnnualYearPensionList(ConverterUtility.convert(java.math.BigDecimal[].class,.get()));

		//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数:  備考:
		//TO:画面データモデル: Lrsc0304 入力:　世帯主収入 key名:hhAnnualYearIncomeList 型:NUMBER[] 備考: 
		//TODO:
		//result.setHhAnnualYearIncomeList(ConverterUtility.convert(java.math.BigDecimal[].class,.get()));

		//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数:  備考:
		//TO:画面データモデル: Lrsc0304 入力:配偶者の年齢リスト key名:spAgeList 型:NUMBER[] 備考: 
		//TODO:
		//result.setSpAgeList(ConverterUtility.convert(java.math.BigDecimal[].class,.get()));

		//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数:  備考:
		//TO:画面データモデル: Lrsc0304 入力:配偶者の西暦リスト key名:spAdList 型:NUMBER[] 備考: 
		//TODO:
		//result.setSpAdList(ConverterUtility.convert(java.math.BigDecimal[].class,.get()));

		//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数:  備考:
		//TO:画面データモデル: Lrsc0304 入力:配偶者の累計の年次データ key名: 型: 備考: 
		//TODO:
		//result.set(ConverterUtility.convert(String.class,.get()));

		//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数:  備考:
		//TO:画面データモデル: Lrsc0304 入力:　公的年金 key名:spAnnualTotalPensionList 型:NUMBER[] 備考: 
		//TODO:
		//result.setSpAnnualTotalPensionList(ConverterUtility.convert(java.math.BigDecimal[].class,.get()));

		//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数:  備考:
		//TO:画面データモデル: Lrsc0304 入力:　配偶者収入 key名:spAnnualTotalIncomeList 型:NUMBER[] 備考: 
		//TODO:
		//result.setSpAnnualTotalIncomeList(ConverterUtility.convert(java.math.BigDecimal[].class,.get()));

		//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数:  備考:
		//TO:画面データモデル: Lrsc0304 入力:配偶者の年度別の年次データ key名: 型: 備考: 
		//TODO:
		//result.set(ConverterUtility.convert(String.class,.get()));

		//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数:  備考:
		//TO:画面データモデル: Lrsc0304 入力:　公的年金 key名:spAnnualYearPensionList 型:NUMBER[] 備考: 
		//TODO:
		//result.setSpAnnualYearPensionList(ConverterUtility.convert(java.math.BigDecimal[].class,.get()));

		//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数:  備考:
		//TO:画面データモデル: Lrsc0304 入力:　配偶者収入 key名:spAnnualYearIncomeList 型:NUMBER[] 備考: 
		//TODO:
		//result.setSpAnnualYearIncomeList(ConverterUtility.convert(java.math.BigDecimal[].class,.get()));

		return result;

	}

	/*
	 * データ変換処理：
	 * :Lrsc030501Collection
	 */
	static public Lrsc030501Collection transferLrsc030501Collection(TLrms2lfJzsknNkjkm tLrms2lfJzsknNkjkm){
		Lrsc030501Collection result=new Lrsc030501Collection();

		//FROM:テーブル:T_LRMS_2LF_JZSKN_NKJKM 論理: 物理: 属性: 桁数: 少数:  備考:
		//TO:画面データモデル: Lrsc030501 入力:id key名:id 型:NUMBER 備考: 
		//TODO:
		//result.setId(ConverterUtility.convert(java.math.BigDecimal.class,tLrms2lfJzsknNkjkm.get()));

		//FROM:テーブル:LRMSセカンドライフ準備済資金年金受給明細 論理: 物理: 属性: 桁数: 少数:  備考:
		//TO:画面データモデル: Lrsc030501 入力:入力方法 key名:inputMethod 型:CODE 備考: 1：年金加入情報から入力、2：手入力
		//TODO:
		//result.setInputMethod(ConverterUtility.convert(String.class,lrmsセカンドライフ準備済資金年金受給明細.get()));

		//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数:  備考:
		//TO:画面データモデル: Lrsc030501 入力:世帯主配偶者識別フラグ key名:personSpouseFlg 型:CODE 備考: 1：世帯主、2：配偶者
		//TODO:
		//result.setPersonSpouseFlg(ConverterUtility.convert(String.class,.get()));

		//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数:  備考:
		//TO:画面データモデル: Lrsc030501 入力:公的年金受取開始年齢入力欄 key名:pensionStartAgeList 型:NUMBER[] 備考: 
		//TODO:
		//result.setPensionStartAgeList(ConverterUtility.convert(java.math.BigDecimal[].class,.get()));

		//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数:  備考:
		//TO:画面データモデル: Lrsc030501 入力:公的年金受取終了年齢入力欄 key名:pensionEndAgeList 型:NUMBER[] 備考: 
		//TODO:
		//result.setPensionEndAgeList(ConverterUtility.convert(java.math.BigDecimal[].class,.get()));

		//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数:  備考:
		//TO:画面データモデル: Lrsc030501 入力:公的年金受取金額入力欄 key名:pensionAmountList 型:NUMBER[] 備考: ÷10000
		//TODO:
		//result.setPensionAmountList(ConverterUtility.convert(java.math.BigDecimal[].class,.get()));

		return result;

	}

	/*
	 * データ変換処理：
	 * :Lrsc030502Collection
	 */
	static public Lrsc030502Collection transferLrsc030502Collection(TLrms2lfJzsknShunyu tLrms2lfJzsknShunyu){
		Lrsc030502Collection result=new Lrsc030502Collection();

		//FROM:テーブル:T_LRMS_2LF_JZSKN_SHUNYU 論理:SEQ 物理:SEQ 属性:Number 桁数:1 少数:  備考:
		//TO:画面データモデル: Lrsc030502 入力:id key名:id 型:NUMBER 備考: 
		//TODO:
		result.setId(ConverterUtility.convert(java.math.BigDecimal.class,tLrms2lfJzsknShunyu.getSeq()));

		//FROM:テーブル:LRMSセカンドライフ準備済資金収入 論理: 物理: 属性: 桁数: 少数:  備考:
		//TO:画面データモデル: Lrsc030502 入力:行番号 key名:lineNo 型:NUMBER 備考: 
		//TODO:
		//result.setLineNo(ConverterUtility.convert(java.math.BigDecimal.class,lrmsセカンドライフ準備済資金収入.get()));

		//FROM:テーブル:T_LRMS_2LF_JZSKN_SHUNYU 論理:家族コード（本人/配偶者） 物理:FAMILY_HONSPO_CD 属性:Char 桁数:2 少数:  備考:
		//TO:画面データモデル: Lrsc030502 入力:世帯主配偶者識別フラグ key名:personSpouseFlg 型:CODE 備考: 1：世帯主、2：配偶者
		//TODO:
		result.setPersonSpouseFlg(ConverterUtility.convert(String.class,tLrms2lfJzsknShunyu.getFamilyHonspoCd()));

		//FROM:テーブル:T_LRMS_2LF_JZSKN_SHUNYU 論理:年収開始年齢 物理:NENSHU_START_AGE 属性:Number 桁数:3 少数:  備考:
		//TO:画面データモデル: Lrsc030502 入力:収入From年齢入力欄 key名:incomeStartAge 型:NUMBER 備考: 
		//TODO:
		result.setIncomeStartAge(ConverterUtility.convert(java.math.BigDecimal.class,tLrms2lfJzsknShunyu.getNenshuStartAge()));

		//FROM:テーブル:T_LRMS_2LF_JZSKN_SHUNYU 論理:年収終了年齢 物理:NENSHU_END_AGE 属性:Number 桁数:3 少数:  備考:
		//TO:画面データモデル: Lrsc030502 入力:収入To年齢入力欄 key名:incomeEndAge 型:NUMBER 備考: 
		//TODO:
		result.setIncomeEndAge(ConverterUtility.convert(java.math.BigDecimal.class,tLrms2lfJzsknShunyu.getNenshuEndAge()));

		//FROM:テーブル:T_LRMS_2LF_JZSKN_SHUNYU 論理:年収額 物理:NENSHU_GAKU 属性:Number 桁数:11 少数:  備考:
		//TO:画面データモデル: Lrsc030502 入力:収入金額入力欄 key名:incomeAmount 型:NUMBER 備考: ÷10000
		//TODO:
		result.setIncomeAmount(LtSvUtils.divide(ConverterUtility.convert(java.math.BigDecimal.class,tLrms2lfJzsknShunyu.getNenshuGaku()),LtSvConst.TEN_THOUSAND));

		return result;

	}

	/*
	 * データ変換処理：
	 * :Lrsc030503Collection
	 */
	static public Lrsc030503Collection transferLrsc030503Collection(TLrms2lfJzsknOther tLrms2lfJzsknOther){
		Lrsc030503Collection result=new Lrsc030503Collection();

		//FROM:テーブル:T_LRMS_2LF_JZSKN_OTHER 論理:SEQ 物理:SEQ 属性:Number 桁数:1 少数:  備考:
		//TO:画面データモデル: Lrsc030503 入力:id key名:id 型:NUMBER 備考: 
		//TODO:
		result.setId(ConverterUtility.convert(java.math.BigDecimal.class,tLrms2lfJzsknOther.getSeq()));

		//FROM:テーブル:LRMSセカンドライフ準備済資金その他収入 論理: 物理: 属性: 桁数: 少数:  備考:
		//TO:画面データモデル: Lrsc030503 入力:行番号 key名:lineNo 型:NUMBER 備考: 
		//TODO:
		//result.setLineNo(ConverterUtility.convert(java.math.BigDecimal.class,lrmsセカンドライフ準備済資金その他収入.get()));

		//FROM:テーブル:T_LRMS_2LF_JZSKN_OTHER 論理:その他収入名 物理:OTHER_SHUNYU_NAME 属性:Varchar2 桁数:10 少数:  備考:
		//TO:画面データモデル: Lrsc030503 入力:その他収入内容 key名:otherContentName 型:CHAR 備考: 
		//TODO:
		result.setOtherContentName(ConverterUtility.convert(String.class,tLrms2lfJzsknOther.getOtherShunyuName()));

		//FROM:テーブル:T_LRMS_2LF_JZSKN_OTHER 論理:収入開始年齢 物理:SHUNYU_START_AGE 属性:Number 桁数:3 少数:  備考:
		//TO:画面データモデル: Lrsc030503 入力:その他収入受取開始年齢入力欄 key名:otherStartAge 型:NUMBER 備考: 
		//TODO:
		result.setOtherStartAge(ConverterUtility.convert(java.math.BigDecimal.class,tLrms2lfJzsknOther.getShunyuStartAge()));

		//FROM:テーブル:T_LRMS_2LF_JZSKN_OTHER 論理:収入終了年齢 物理:SHUNYU_END_AGE 属性:Number 桁数:3 少数:  備考:
		//TO:画面データモデル: Lrsc030503 入力:その他収入受取終了年齢入力欄 key名:otherEndAge 型:NUMBER 備考: 
		//TODO:
		result.setOtherEndAge(ConverterUtility.convert(java.math.BigDecimal.class,tLrms2lfJzsknOther.getShunyuEndAge()));

		//FROM:テーブル:T_LRMS_2LF_JZSKN_OTHER 論理:収入額 物理:SHUNYU_GAKU 属性:Number 桁数:11 少数:  備考:
		//TO:画面データモデル: Lrsc030503 入力:その他収入金額入力欄 key名:otherAmount 型:NUMBER 備考: ÷10000
		//TODO:
		result.setOtherAmount(LtSvUtils.divide(ConverterUtility.convert(java.math.BigDecimal.class,tLrms2lfJzsknOther.getShunyuGaku()),LtSvConst.TEN_THOUSAND));

		//FROM:テーブル:※項目セット無し　(画面にて算出) 論理: 物理: 属性: 桁数: 少数:  備考:
		//TO:画面データモデル: Lrsc030503 入力:その他収入内容コード key名:otherContentCode 型:CODE 備考: 
		//TODO:
		//result.setOtherContentCode(ConverterUtility.convert(String.class,※項目セット無し　(画面にて算出).get()));

		return result;

	}

	/*
	 * データ変換処理：
	 * :Lrsc030701Collection
	 */
	static public Lrsc030701Collection transferLrsc030701Collection(){
		Lrsc030701Collection result=new Lrsc030701Collection();

		//FROM:テーブル:※項目セット無し　(画面にて算出) 論理: 物理: 属性: 桁数: 少数:  備考:
		//TO:画面データモデル: Lrsc030701 入力:id key名:id 型:NUMBER 備考: 
		//TODO:
		//result.setId(ConverterUtility.convert(java.math.BigDecimal.class,※項目セット無し　(画面にて算出).get()));

		//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数:  備考:
		//TO:画面データモデル: Lrsc030701 入力:累計の年次データ key名: 型: 備考: 
		//TODO:
		//result.set(ConverterUtility.convert(String.class,.get()));

		//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数:  備考:
		//TO:画面データモデル: Lrsc030701 入力:　不足額 key名:annualTotalListShortageList 型:NUMBER 備考: 単位：万円
		//TODO:
		//result.setAnnualTotalListShortageList(ConverterUtility.convert(java.math.BigDecimal.class,.get()));

		//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数:  備考:
		//TO:画面データモデル: Lrsc030701 入力:年度別の年次データ key名: 型: 備考: 
		//TODO:
		//result.set(ConverterUtility.convert(String.class,.get()));

		//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数:  備考:
		//TO:画面データモデル: Lrsc030701 入力:　不足額 key名:annualYearListShortageList 型:NUMBER 備考: 単位：万円
		//TODO:
		//result.setAnnualYearListShortageList(ConverterUtility.convert(java.math.BigDecimal.class,.get()));

		//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数:  備考:
		//TO:画面データモデル: Lrsc030701 入力:　その他必要資金(趣味イベント、その他) key名:annualYearListOtherList 型:NUMBER 備考: 単位：万円
		//TODO:
		//result.setAnnualYearListOtherList(ConverterUtility.convert(java.math.BigDecimal.class,.get()));

		return result;

	}

}
