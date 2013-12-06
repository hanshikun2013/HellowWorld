package temp.T2D.souzoku.copier.gen;

import jp.co.axa.life.app.lt.util.ConverterUtility;
import temp.T2D.souzoku.datamodel.gen.Lisc0001Collection;
import temp.T2D.souzoku.datamodel.gen.Lisc000101Collection;
import temp.T2D.souzoku.datamodel.gen.Lbsc0002Collection;
import temp.T2D.souzoku.entity.gen.TLrmsSogakuKihon;
import temp.T2D.souzoku.entity.gen.TLrmsSogakuZisn;


class Table2DatamodelCopier{


	/*
	 * データ変換処理：
	 * ＬＲＭＳ相続:Lisc0001Collection
	 */
	static public Lisc0001Collection ＬＲＭＳ相続_Lisc0001Collection(TLrmsSogakuKihon tLrmsSogakuKihon){
		Lisc0001Collection result=new Lisc0001Collection();
		{
			//FROM:テーブル:０をセット 論理: 物理: 属性: 桁数: 少数:  備考:
			//TO:画面データモデル: Lisc0001 入力:ID key名:id 型:NUMBER 備考: 
			//TODO:
			//result.setId(ConverterUtility.convert(String.class,０をセット.get()));
		}
		{
			//FROM:テーブル:T_LRMS_SOGAKU_KIHON 論理:配偶者有無コード 物理:SPOUSE_UMU_CD 属性:Char 桁数:1 少数:  備考:
			//TO:画面データモデル: Lisc0001 入力:配偶者有無 key名:maritalStatus 型:CODE 備考: 
			//TODO:
			result.setMaritalStatus(ConverterUtility.convert(String.class,tLrmsSogakuKihon.getSpouseUmuCd()));
		}
		{
			//FROM:テーブル:T_LRMS_SOGAKU_KIHON 論理:法定相続人種別コード 物理:HTSZN_SB_CD 属性:Char 桁数:1 少数:  備考:
			//TO:画面データモデル: Lisc0001 入力:法定相続人設定 key名:settingOfHeir 型:CODE 備考: 
			//TODO:
			result.setSettingOfHeir(ConverterUtility.convert(String.class,tLrmsSogakuKihon.getHtsznSbCd()));
		}
		{
			//FROM:テーブル:T_LRMS_SOGAKU_KIHON 論理:法定相続人数 物理:HTSZN_CNT 属性:Number 桁数:1 少数:  備考:
			//TO:画面データモデル: Lisc0001 入力:相続人数 key名:heirNumber 型:CODE 備考: 
			//TODO:
			result.setHeirNumber(ConverterUtility.convert(String.class,tLrmsSogakuKihon.getHtsznCnt()));
		}
		{
			//FROM:テーブル:本人'h1'をセット 論理: 物理: 属性: 桁数: 少数:  備考:
			//TO:画面データモデル: Lisc0001 入力:家族No key名:familyNo 型:String 備考: 
			//TODO:
			//result.setFamilyNo(ConverterUtility.convert(String.class,本人'h1'をセット.get()));
		}
		{
			//FROM:テーブル:※項目セット無し　(画面にて算出) 論理: 物理: 属性: 桁数: 少数:  備考:
			//TO:画面データモデル: Lisc0001 入力:配偶者有無文字 key名:maritalStatusString 型:String 備考: 
			//TODO:
			//result.setMaritalStatusString(ConverterUtility.convert(String.class,※項目セット無し　(画面にて算出).get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数:  備考:
			//TO:画面データモデル: Lisc0001 入力:法定相続人設定文字 key名:settingOfHeirString 型:String 備考: 
			//TODO:
			//result.setSettingOfHeirString(ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数:  備考:
			//TO:画面データモデル: Lisc0001 入力:相続人数文字 key名:heirNumberString 型:String 備考: 
			//TODO:
			//result.setHeirNumberString(ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数:  備考:
			//TO:画面データモデル: Lisc0001 入力:相続人1 key名:heir1 型:CODE 備考: 
			//TODO:
			//result.setHeir1(ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数:  備考:
			//TO:画面データモデル: Lisc0001 入力:相続人1文字 key名:heir1String 型:String 備考: 
			//TODO:
			//result.setHeir1String(ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数:  備考:
			//TO:画面データモデル: Lisc0001 入力:相続人2 key名:heir2 型:CODE 備考: 
			//TODO:
			//result.setHeir2(ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数:  備考:
			//TO:画面データモデル: Lisc0001 入力:相続人2文字 key名:heir2String 型:String 備考: 
			//TODO:
			//result.setHeir2String(ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数:  備考:
			//TO:画面データモデル: Lisc0001 入力:相続人3 key名:heir3 型:CODE 備考: 
			//TODO:
			//result.setHeir3(ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数:  備考:
			//TO:画面データモデル: Lisc0001 入力:相続人3文字 key名:heir3String 型:String 備考: 
			//TODO:
			//result.setHeir3String(ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数:  備考:
			//TO:画面データモデル: Lisc0001 入力:相続人4 key名:heir4 型:CODE 備考: 
			//TODO:
			//result.setHeir4(ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数:  備考:
			//TO:画面データモデル: Lisc0001 入力:相続人4文字 key名:heir4String 型:String 備考: 
			//TODO:
			//result.setHeir4String(ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数:  備考:
			//TO:画面データモデル: Lisc0001 入力:相続人5 key名:heir5 型:CODE 備考: 
			//TODO:
			//result.setHeir5(ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数:  備考:
			//TO:画面データモデル: Lisc0001 入力:相続人5文字 key名:heir5String 型:String 備考: 
			//TODO:
			//result.setHeir5String(ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数:  備考:
			//TO:画面データモデル: Lisc0001 入力:相続財産評価合計 key名:appraisedTotalValue 型:NUMBER 備考: 
			//TODO:
			//result.setAppraisedTotalValue(ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数:  備考:
			//TO:画面データモデル: Lisc0001 入力:相続人1_相続額合計 key名:heirTotalValue1 型:NUMBER 備考: 
			//TODO:
			//result.setHeirTotalValue1(ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数:  備考:
			//TO:画面データモデル: Lisc0001 入力:相続人2_相続額合計 key名:heirTotalValue2 型:NUMBER 備考: 
			//TODO:
			//result.setHeirTotalValue2(ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数:  備考:
			//TO:画面データモデル: Lisc0001 入力:相続人3_相続額合計 key名:heirTotalValue3 型:NUMBER 備考: 
			//TODO:
			//result.setHeirTotalValue3(ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数:  備考:
			//TO:画面データモデル: Lisc0001 入力:相続人4_相続額合計 key名:heirTotalValue4 型:NUMBER 備考: 
			//TODO:
			//result.setHeirTotalValue4(ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数:  備考:
			//TO:画面データモデル: Lisc0001 入力:相続人5_相続額合計 key名:heirTotalValue5 型:NUMBER 備考: 
			//TODO:
			//result.setHeirTotalValue5(ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数:  備考:
			//TO:画面データモデル: Lisc0001 入力:相続税総額 key名:heirTaxTotalValue 型:NUMBER 備考: 
			//TODO:
			//result.setHeirTaxTotalValue(ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数:  備考:
			//TO:画面データモデル: Lisc0001 入力:完全防衛額 key名:defenceValue 型:NUMBER 備考: 
			//TODO:
			//result.setDefenceValue(ConverterUtility.convert(String.class,.get()));
		}

		return result;

	}

	/*
	 * データ変換処理：
	 * ＬＲＭＳ相続:Lisc000101Collection
	 */
	static public Lisc000101Collection ＬＲＭＳ相続_Lisc000101Collection(TLrmsSogakuZisn tLrmsSogakuZisn){
		Lisc000101Collection result=new Lisc000101Collection();
		{
			//FROM:テーブル:T_LRMS_SOGAKU_ZISN 論理:SEQ 物理:SEQ 属性:Number 桁数:1 少数:  備考:
			//TO:画面データモデル: Lisc000101 入力:ID key名:id 型:NUMBER 備考: 
			//TODO:
			result.setId(ConverterUtility.convert(String.class,tLrmsSogakuZisn.getSeq()));
		}
		{
			//FROM:テーブル:T_LRMS_SOGAKU_ZISN 論理:相続財産コード 物理:SOZOKU_ZISN_CD 属性:Char 桁数:2 少数:  備考:
			//TO:画面データモデル: Lisc000101 入力:相続財産 key名:inheritance 型:CODE 備考: 
			//TODO:
			result.setInheritance(ConverterUtility.convert(String.class,tLrmsSogakuZisn.getSozokuZisnCd()));
		}
		{
			//FROM:テーブル:T_LRMS_SOGAKU_ZISN 論理:相続財産評価額 物理:SOZOKU_GAKU 属性:Number 桁数:11 少数:  備考:
			//TO:画面データモデル: Lisc000101 入力:評価額 key名:appraisedValue 型:NUMBER 備考: 
			//TODO:
			result.setAppraisedValue(ConverterUtility.convert(String.class,tLrmsSogakuZisn.getSozokuGaku()));
		}
		{
			//FROM:テーブル:T_LRMS_SOGAKU_ZISN 論理:法定相続人種別（個別）コード 物理:HTSZN_SB_KOBETSU_CD 属性:Char 桁数:2 少数:  備考:
			//TO:画面データモデル: Lisc000101 入力:相続人 key名:heir 型:CODE 備考: 
			//TODO:
			result.setHeir(ConverterUtility.convert(String.class,tLrmsSogakuZisn.getHtsznSbKobetsuCd()));
		}
		{
			//FROM:テーブル:※項目セット無し　(画面にて算出) 論理: 物理: 属性: 桁数: 少数:  備考:
			//TO:画面データモデル: Lisc000101 入力:相続財産文字 key名:inheritanceString 型:String 備考: 
			//TODO:
			//result.setInheritanceString(ConverterUtility.convert(String.class,※項目セット無し　(画面にて算出).get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数:  備考:
			//TO:画面データモデル: Lisc000101 入力:相続人文字 key名:heirString 型:String 備考: 
			//TODO:
			//result.setHeirString(ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数:  備考:
			//TO:画面データモデル: Lisc000101 入力:相続人1_相続額 key名:heirValue1 型:NUMBER 備考: 
			//TODO:
			//result.setHeirValue1(ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数:  備考:
			//TO:画面データモデル: Lisc000101 入力:相続人2_相続額 key名:heirValue2 型:NUMBER 備考: 
			//TODO:
			//result.setHeirValue2(ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数:  備考:
			//TO:画面データモデル: Lisc000101 入力:相続人3_相続額 key名:heirValue3 型:NUMBER 備考: 
			//TODO:
			//result.setHeirValue3(ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数:  備考:
			//TO:画面データモデル: Lisc000101 入力:相続人4_相続額 key名:heirValue4 型:NUMBER 備考: 
			//TODO:
			//result.setHeirValue4(ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数:  備考:
			//TO:画面データモデル: Lisc000101 入力:相続人5_相続額 key名:heirValue5 型:NUMBER 備考: 
			//TODO:
			//result.setHeirValue5(ConverterUtility.convert(String.class,.get()));
		}

		return result;

	}

	/*
	 * データ変換処理：
	 * ＬＲＭＳ相続:lbsc0002Collection
	 */
	static public Lbsc0002Collection ＬＲＭＳ相続_lbsc0002Collection(){
		Lbsc0002Collection result=new Lbsc0002Collection();
		{
			//FROM:テーブル:３レコード生成し、１，２，３をセット 論理: 物理: 属性: 桁数: 少数:  備考:
			//TO:画面データモデル: lbsc0002 入力:ID key名:id 型:NUMBER 備考: 
			//TODO:
			//result.setId(ConverterUtility.convert(String.class,３レコード生成し、１，２，３をセット.get()));
		}
		{
			//FROM:テーブル:※項目セット無し　(画面にて算出) 論理: 物理: 属性: 桁数: 少数:  備考:
			//TO:画面データモデル: lbsc0002 入力:相続人1_金額 key名:heirValue1 型:NUMBER 備考: 
			//TODO:
			//result.setHeirValue1(ConverterUtility.convert(String.class,※項目セット無し　(画面にて算出).get()));
		}
		{
			//FROM:テーブル:　データモデルの生成は必要 論理: 物理: 属性: 桁数: 少数:  備考:
			//TO:画面データモデル: lbsc0002 入力:相続人2_金額 key名:heirValue2 型:NUMBER 備考: 
			//TODO:
			//result.setHeirValue2(ConverterUtility.convert(String.class,　データモデルの生成は必要.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数:  備考:
			//TO:画面データモデル: lbsc0002 入力:相続人3_金額 key名:heirValue3 型:NUMBER 備考: 
			//TODO:
			//result.setHeirValue3(ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数:  備考:
			//TO:画面データモデル: lbsc0002 入力:相続人4_金額 key名:heirValue4 型:NUMBER 備考: 
			//TODO:
			//result.setHeirValue4(ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数:  備考:
			//TO:画面データモデル: lbsc0002 入力:相続人5_金額 key名:heirValue5 型:NUMBER 備考: 
			//TODO:
			//result.setHeirValue5(ConverterUtility.convert(String.class,.get()));
		}

		return result;

	}

}
