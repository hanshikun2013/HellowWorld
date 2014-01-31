


SET ECHO OFF
SET FEEDBACK
SET HEADING 
SET PAGESIZE 0
SET TERMOUT OFF
SET TRIMSPOOL ON
set  linesize  9999

--------------------------------------------------
--L_CMSTT0001
SPOOL L_CMSTT0001.csv 

SELECT 
'COMPUTER_NAME' || ',' ||
'IP_ADRESS' || ',' ||
'OUTPUT_DATE' || ',' ||
'ToriatsukaishaID' || ',' ||
'ToriatsukaishaMei' || ',' ||
'ALToriatsukaishaCode' || ',' ||
'AGLToriatsukaishaCode' || ',' ||
'KengenKubun' || ',' ||
'Password' || ',' ||
'DairitenJouhou_DairitemMei' || ',' ||
'DairitenJouhou_YuubimBangou1' || ',' ||
'DairitenJouhou_YuubimBangou2' || ',' ||
'DairitenJouhou_Juusho1' || ',' ||
'DairitenJouhou_Juusho2' || ',' ||
'DairitenJouhou_DenwaBangou1' || ',' ||
'DairitenJouhou_DenwaBangou2' || ',' ||
'DairitenJouhou_DenwaBangou3' || ',' ||
'ShozokuEigyoutenJouhou_temMei' || ',' ||
'ShozokuEigyoutenJouhou_Yubim1' || ',' ||
'ShozokuEigyoutenJouhou_Yubim2' || ',' ||
'ShozokuEigyoutenJouhou_Jusho1' || ',' ||
'ShozokuEigyoutenJouhou_Jusho2' || ',' ||
'ShozokuEigyoutenJouhou_Tel1' || ',' ||
'ShozokuEigyoutenJouhou_Tel2' || ',' ||
'ShozokuEigyoutenJouhou_Tel3' || ',' ||
'HengakuTourokuBangou' || ',' ||
'Toriatsukaisha_Bikou' || ',' ||
'LoginKyokaFlag' || ',' ||
'SakuseishaID' || ',' ||
'SakuseiNichiji' || ',' ||
'KoushinshaID' || ',' ||
'KoushinNichiji' || ',' ||
'MofCode' || ',' ||
'WindowsLoginID' || ',' ||
'' || ',' ||
'BoshuuTeateShikyuuKubun' || ',' ||
'Channel_Kbn' || ',' ||
'Commision_Chart_Code' || ',' ||
'Third_Commision_Chart_Code' || ',' ||
'Shikyu_Keisu' || ',' ||
'Satei_Nengetsu' 
FROM   dual;

SELECT 
COMPUTER_NAME || ',' ||
IP_ADRESS || ',' ||
to_char( OUTPUT_DATE,'yyyy/mm/dd hh24:mi:ss')  || ',' ||
ToriatsukaishaID || ',' ||
ToriatsukaishaMei || ',' ||
ALToriatsukaishaCode || ',' ||
AGLToriatsukaishaCode || ',' ||
KengenKubun || ',' ||
Password || ',' ||
DairitenJouhou_DairitemMei || ',' ||
DairitenJouhou_YuubimBangou1 || ',' ||
DairitenJouhou_YuubimBangou2 || ',' ||
DairitenJouhou_Juusho1 || ',' ||
DairitenJouhou_Juusho2 || ',' ||
DairitenJouhou_DenwaBangou1 || ',' ||
DairitenJouhou_DenwaBangou2 || ',' ||
DairitenJouhou_DenwaBangou3 || ',' ||
ShozokuEigyoutenJouhou_temMei || ',' ||
ShozokuEigyoutenJouhou_Yubim1 || ',' ||
ShozokuEigyoutenJouhou_Yubim2 || ',' ||
ShozokuEigyoutenJouhou_Jusho1 || ',' ||
ShozokuEigyoutenJouhou_Jusho2 || ',' ||
ShozokuEigyoutenJouhou_Tel1 || ',' ||
ShozokuEigyoutenJouhou_Tel2 || ',' ||
ShozokuEigyoutenJouhou_Tel3 || ',' ||
HengakuTourokuBangou || ',' ||
Toriatsukaisha_Bikou || ',' ||
LoginKyokaFlag || ',' ||
SakuseishaID || ',' ||
to_char( SakuseiNichiji,'yyyy/mm/dd hh24:mi:ss')  || ',' ||
KoushinshaID || ',' ||
KoushinNichiji || ',' ||
MofCode || ',' ||
WindowsLoginID || ',' ||
 || ',' ||
BoshuuTeateShikyuuKubun || ',' ||
Channel_Kbn || ',' ||
Commision_Chart_Code || ',' ||
Third_Commision_Chart_Code || ',' ||
Shikyu_Keisu || ',' ||
Satei_Nengetsu
FROM L_CMSTT0001 ;

SPOOL OFF 
--------------------------------------------------
--------------------------------------------------
--L_CMSTT0010
SPOOL L_CMSTT0010.csv 

SELECT 
'COMPUTER_NAME' || ',' ||
'IP_ADRESS' || ',' ||
'OUTPUT_DATE' || ',' ||
'TORIATSUKAISHAID' || ',' ||
'KOKYAKUNO' || ',' ||
'KOJINHOJINKUBUN' || ',' ||
'KOKYAKUTSUDUKIGARA' || ',' ||
'SHUSSINCHI' || ',' ||
'JYUUKYOKUBUN' || ',' ||
'SHOUKAIEIKYOURYOKU' || ',' ||
'SAISHUGAKUREKI' || ',' ||
'SHUSSINKOU' || ',' ||
'KENKOJOUTAI' || ',' ||
'KURUMAUMU' || ',' ||
'KINMUSAKIMEISHOUKANA' || ',' ||
'KINMUSAKIMEISHOUKANJI' || ',' ||
'SHOKUSHU' || ',' ||
'KINMUSAKIYUUBINBANGOU_1' || ',' ||
'KINMUSAKIYUUBINBANGOU_2' || ',' ||
'KINMUSAKIJYUUSHO_1' || ',' ||
'KINMUSAKIJYUUSHO_2' || ',' ||
'KINMUSAKIJYUUSHO_3' || ',' ||
'KINMUSAKICHOKUTSUUTEL' || ',' ||
'KINMUSAKIDAIHYOUTEL' || ',' ||
'KINMUSAKIFAX' || ',' ||
'KINMUSAKIEMAIL' || ',' ||
'YAKUSHOKU' || ',' ||
'YAKUSHOKUSEISHIKIMEI' || ',' ||
'NYUSHANENREI' || ',' ||
'SYUUSHOKUNENREI' || ',' ||
'NENSHU' || ',' ||
'SETAINO' || ',' ||
'TARGETKOKYAKUID' || ',' ||
'KOKYAKUYUUBINBANGOU_1' || ',' ||
'KOKYAKUYUUBINBANGOU_2' || ',' ||
'KOKYAKUJYUUSHO_1' || ',' ||
'KOKYAKUJYUUSHO_2' || ',' ||
'KOKYAKUJYUUSHO_3' || ',' ||
'KOKYAKUTEL' || ',' ||
'KOKYAKUFAX' || ',' ||
'KOKYAKUKEITAITEL' || ',' ||
'KOKYAKUEMAIL' || ',' ||
'BIKOU' || ',' ||
'KOKYAKUJYUUSHO_KANA1' || ',' ||
'KOKYAKUJYUUSHO_KANA2' || ',' ||
'KOKYAKUJYUUSHO_KANA3' || ',' ||
'KINMUSAKIJYUUSHO_KANA1' || ',' ||
'KINMUSAKIJYUUSHO_KANA2' || ',' ||
'KINMUSAKIJYUUSHO_KANA3' || ',' ||
'HOUJINNO' || ',' ||
'KOKYAKUJYOUKYOU' || ',' ||
'SAISHUUKATSUDOUBI' || ',' ||
'THIRDIFJIKKOUBI' || ',' ||
'SAKUSEISHAID' || ',' ||
'SAKUSEINICHIJI' || ',' ||
'KOUSHINSHAID' || ',' ||
'KOUSHINNICHIJI' 
FROM   dual;

SELECT 
COMPUTER_NAME || ',' ||
IP_ADRESS || ',' ||
to_char( OUTPUT_DATE,'yyyy/mm/dd hh24:mi:ss')  || ',' ||
TORIATSUKAISHAID || ',' ||
KOKYAKUNO || ',' ||
KOJINHOJINKUBUN || ',' ||
KOKYAKUTSUDUKIGARA || ',' ||
SHUSSINCHI || ',' ||
JYUUKYOKUBUN || ',' ||
SHOUKAIEIKYOURYOKU || ',' ||
SAISHUGAKUREKI || ',' ||
SHUSSINKOU || ',' ||
KENKOJOUTAI || ',' ||
KURUMAUMU || ',' ||
KINMUSAKIMEISHOUKANA || ',' ||
KINMUSAKIMEISHOUKANJI || ',' ||
SHOKUSHU || ',' ||
KINMUSAKIYUUBINBANGOU_1 || ',' ||
KINMUSAKIYUUBINBANGOU_2 || ',' ||
KINMUSAKIJYUUSHO_1 || ',' ||
KINMUSAKIJYUUSHO_2 || ',' ||
KINMUSAKIJYUUSHO_3 || ',' ||
KINMUSAKICHOKUTSUUTEL || ',' ||
KINMUSAKIDAIHYOUTEL || ',' ||
KINMUSAKIFAX || ',' ||
KINMUSAKIEMAIL || ',' ||
YAKUSHOKU || ',' ||
YAKUSHOKUSEISHIKIMEI || ',' ||
NYUSHANENREI || ',' ||
SYUUSHOKUNENREI || ',' ||
NENSHU || ',' ||
SETAINO || ',' ||
TARGETKOKYAKUID || ',' ||
KOKYAKUYUUBINBANGOU_1 || ',' ||
KOKYAKUYUUBINBANGOU_2 || ',' ||
KOKYAKUJYUUSHO_1 || ',' ||
KOKYAKUJYUUSHO_2 || ',' ||
KOKYAKUJYUUSHO_3 || ',' ||
KOKYAKUTEL || ',' ||
KOKYAKUFAX || ',' ||
KOKYAKUKEITAITEL || ',' ||
KOKYAKUEMAIL || ',' ||
BIKOU || ',' ||
KOKYAKUJYUUSHO_KANA1 || ',' ||
KOKYAKUJYUUSHO_KANA2 || ',' ||
KOKYAKUJYUUSHO_KANA3 || ',' ||
KINMUSAKIJYUUSHO_KANA1 || ',' ||
KINMUSAKIJYUUSHO_KANA2 || ',' ||
KINMUSAKIJYUUSHO_KANA3 || ',' ||
HOUJINNO || ',' ||
KOKYAKUJYOUKYOU || ',' ||
to_char( SAISHUUKATSUDOUBI,'yyyy/mm/dd hh24:mi:ss')  || ',' ||
to_char( THIRDIFJIKKOUBI,'yyyy/mm/dd hh24:mi:ss')  || ',' ||
SAKUSEISHAID || ',' ||
to_char( SAKUSEINICHIJI,'yyyy/mm/dd hh24:mi:ss')  || ',' ||
KOUSHINSHAID || ',' ||
to_char( KOUSHINNICHIJI,'yyyy/mm/dd hh24:mi:ss')
FROM L_CMSTT0010 ;

SPOOL OFF 
--------------------------------------------------
--------------------------------------------------
--L_CMSTT0600
SPOOL L_CMSTT0600.csv 

SELECT 
'COMPUTER_NAME' || ',' ||
'IP_ADRESS' || ',' ||
'OUTPUT_DATE' || ',' ||
'TORIATSUKAISHAID' || ',' ||
'KOKYAKUBANGOU' || ',' ||
'CARENBAN' || ',' ||
'RENBAN' || ',' ||
'JITSUZAIFLAG' || ',' ||
'KODOMOKOKYAKUBANGOU' || ',' ||
'CAYOUKANA' || ',' ||
'CAYOUKANJI' || ',' ||
'SEIBETSUCODE' || ',' ||
'SEINENGAPPI' || ',' ||
'NENREI' || ',' ||
'KEKKONNENREI' || ',' ||
'KEKKONHITSUYOUGAKU' || ',' ||
'YOUCHIENCODE' || ',' ||
'YOUCHIENNENREI' || ',' ||
'SHOUGAKKOUSHURUICODE' || ',' ||
'SHOUGAKKOUNENREI' || ',' ||
'CHUUGAKKOUSHURUICODE' || ',' ||
'CHUUGAKKOUNENREI' || ',' ||
'KOUKOUSHURUICODE' || ',' ||
'KOUKOUNENREI' || ',' ||
'DAIGAKUSHURUICODE' || ',' ||
'DAIGAKUNENREI' || ',' ||
'TSUUGAKUCODE' || ',' ||
'KYOUIKUHITSUYOUGAKUGOUKEI' || ',' ||
'KYOUIKUSASAERUWARIAI' || ',' ||
'KYOUIKUSASAERUWARIAI_W' || ',' ||
'KEKKONSASAERUWARIAI' || ',' ||
'KEKKONSASAERUWARIAI_W' || ',' ||
'SAKUSEISHAID' || ',' ||
'SAKUSEINICHIJI' || ',' ||
'KOUSHINSHAID' || ',' ||
'KOUSHINNICHIJI' 
FROM   dual;

SELECT 
COMPUTER_NAME || ',' ||
IP_ADRESS || ',' ||
to_char( OUTPUT_DATE,'yyyy/mm/dd hh24:mi:ss')  || ',' ||
TORIATSUKAISHAID || ',' ||
KOKYAKUBANGOU || ',' ||
CARENBAN || ',' ||
RENBAN || ',' ||
JITSUZAIFLAG || ',' ||
KODOMOKOKYAKUBANGOU || ',' ||
CAYOUKANA || ',' ||
CAYOUKANJI || ',' ||
SEIBETSUCODE || ',' ||
to_char( SEINENGAPPI,'yyyy/mm/dd hh24:mi:ss')  || ',' ||
NENREI || ',' ||
KEKKONNENREI || ',' ||
KEKKONHITSUYOUGAKU || ',' ||
YOUCHIENCODE || ',' ||
YOUCHIENNENREI || ',' ||
SHOUGAKKOUSHURUICODE || ',' ||
SHOUGAKKOUNENREI || ',' ||
CHUUGAKKOUSHURUICODE || ',' ||
CHUUGAKKOUNENREI || ',' ||
KOUKOUSHURUICODE || ',' ||
KOUKOUNENREI || ',' ||
DAIGAKUSHURUICODE || ',' ||
DAIGAKUNENREI || ',' ||
TSUUGAKUCODE || ',' ||
KYOUIKUHITSUYOUGAKUGOUKEI || ',' ||
KYOUIKUSASAERUWARIAI || ',' ||
KYOUIKUSASAERUWARIAI_W || ',' ||
KEKKONSASAERUWARIAI || ',' ||
KEKKONSASAERUWARIAI_W || ',' ||
SAKUSEISHAID || ',' ||
to_char( SAKUSEINICHIJI,'yyyy/mm/dd hh24:mi:ss')  || ',' ||
KOUSHINSHAID || ',' ||
to_char( KOUSHINNICHIJI,'yyyy/mm/dd hh24:mi:ss')
FROM L_CMSTT0600 ;

SPOOL OFF 
--------------------------------------------------
--------------------------------------------------
--L_CMSTT0601
SPOOL L_CMSTT0601.csv 

SELECT 
'COMPUTER_NAME' || ',' ||
'IP_ADRESS' || ',' ||
'OUTPUT_DATE' || ',' ||
'TORIATSUKAISHAID' || ',' ||
'KOKYAKUBANGOU' || ',' ||
'CARENBAN' || ',' ||
'JUUTAKUGENZAIJUKYOCODE' || ',' ||
'JUUTAKUGENZAILOANGAKU' || ',' ||
'JUUTAKUGENZAILOANKIKAN' || ',' ||
'JUUTAKUGENZAINENYACHIN' || ',' ||
'JUUTAKUYOTEICODE' || ',' ||
'JUUTAKUYOTEINEN' || ',' ||
'JUUTAKUCHIIKICODE' || ',' ||
'JUUTAKUBUKKENCODE' || ',' ||
'JUUTAKUSHINKYUUCODE' || ',' ||
'JUUTAKUKAIRYOUKAKAKU' || ',' ||
'JUUTAKUATAMAKINN' || ',' ||
'JUUTAKUATAMAKINNWARIAI' || ',' ||
'JUUTAKULOANGAKU1' || ',' ||
'JUUTAKULOANKIKAN1' || ',' ||
'JUUTAKULOANRIRITSU1' || ',' ||
'JUUTAKULOANGAKU2' || ',' ||
'JUUTAKULOANKIKAN2' || ',' ||
'JUUTAKULOANRIRITSU2' || ',' ||
'JUUTAKULOANGAKU3' || ',' ||
'JUUTAKULOANKIKAN3' || ',' ||
'JUUTAKULOANRIRITSU3' || ',' ||
'JUUTAKUSHOKEIHI' || ',' ||
'JUUTAKUKYOUEKIHI' || ',' ||
'DANSHINKANYUUFLAG' || ',' ||
'DANSHINKANYUUFLAG_W' || ',' ||
'GENYACHINNYUURYOKUKUBUN' || ',' ||
'GENYACHINNYUURYOKUKUBUN_W' || ',' ||
'GENYACHINKINGAKU' || ',' ||
'GENYACHINKINGAKU_W' || ',' ||
'GENZAILOANNYUURYOKUKUBUN' || ',' ||
'GENZAILOANNYUURYOKUKUBUN_W' || ',' ||
'GENZAILOANKINGAKU' || ',' ||
'GENZAILOANKINGAKU_W' || ',' ||
'GENYACHINWARIAI' || ',' ||
'GENYACHINWARIAIHAIGUUSHA' || ',' ||
'GENZAILOANSASAERUWARIAI' || ',' ||
'GENLOANWARIAIHAIGUUSHA' || ',' ||
'KEIKAKUHENKOUCODE' || ',' ||
'KEIKAKUHENKOUCODEHAIGUUSHA' || ',' ||
'JUUTAKUSASAERUKUBUN' || ',' ||
'JUUTAKUSASAERUKUBUN_W' || ',' ||
'JUUTAKUSASAERUKINGAKU' || ',' ||
'JUUTAKUSASAERUKINGAKU_W' || ',' ||
'JUTAKUSHOKEIHIMANNICHI' || ',' ||
'JUTAKUSHOKEIHIMANNICHI_W' || ',' ||
'JUTAKUKYOUEKIHIMANNICHI' || ',' ||
'JUTAKUKYOUEKIHIMANNICHI_W' || ',' ||
'JUUTAKUSASAERUWARIAI' || ',' ||
'JUUTAKUSASAERUWARIAI_W' || ',' ||
'SAKUSEISHAID' || ',' ||
'SAKUSEINICHIJI' || ',' ||
'KOUSHINSHAID' || ',' ||
'KOUSHINNICHIJI' 
FROM   dual;

SELECT 
COMPUTER_NAME || ',' ||
IP_ADRESS || ',' ||
to_char( OUTPUT_DATE,'yyyy/mm/dd hh24:mi:ss')  || ',' ||
TORIATSUKAISHAID || ',' ||
KOKYAKUBANGOU || ',' ||
CARENBAN || ',' ||
JUUTAKUGENZAIJUKYOCODE || ',' ||
JUUTAKUGENZAILOANGAKU || ',' ||
JUUTAKUGENZAILOANKIKAN || ',' ||
JUUTAKUGENZAINENYACHIN || ',' ||
JUUTAKUYOTEICODE || ',' ||
JUUTAKUYOTEINEN || ',' ||
JUUTAKUCHIIKICODE || ',' ||
JUUTAKUBUKKENCODE || ',' ||
JUUTAKUSHINKYUUCODE || ',' ||
JUUTAKUKAIRYOUKAKAKU || ',' ||
JUUTAKUATAMAKINN || ',' ||
JUUTAKUATAMAKINNWARIAI || ',' ||
JUUTAKULOANGAKU1 || ',' ||
JUUTAKULOANKIKAN1 || ',' ||
JUUTAKULOANRIRITSU1 || ',' ||
JUUTAKULOANGAKU2 || ',' ||
JUUTAKULOANKIKAN2 || ',' ||
JUUTAKULOANRIRITSU2 || ',' ||
JUUTAKULOANGAKU3 || ',' ||
JUUTAKULOANKIKAN3 || ',' ||
JUUTAKULOANRIRITSU3 || ',' ||
JUUTAKUSHOKEIHI || ',' ||
JUUTAKUKYOUEKIHI || ',' ||
DANSHINKANYUUFLAG || ',' ||
DANSHINKANYUUFLAG_W || ',' ||
GENYACHINNYUURYOKUKUBUN || ',' ||
GENYACHINNYUURYOKUKUBUN_W || ',' ||
GENYACHINKINGAKU || ',' ||
GENYACHINKINGAKU_W || ',' ||
GENZAILOANNYUURYOKUKUBUN || ',' ||
GENZAILOANNYUURYOKUKUBUN_W || ',' ||
GENZAILOANKINGAKU || ',' ||
GENZAILOANKINGAKU_W || ',' ||
GENYACHINWARIAI || ',' ||
GENYACHINWARIAIHAIGUUSHA || ',' ||
GENZAILOANSASAERUWARIAI || ',' ||
GENLOANWARIAIHAIGUUSHA || ',' ||
KEIKAKUHENKOUCODE || ',' ||
KEIKAKUHENKOUCODEHAIGUUSHA || ',' ||
JUUTAKUSASAERUKUBUN || ',' ||
JUUTAKUSASAERUKUBUN_W || ',' ||
JUUTAKUSASAERUKINGAKU || ',' ||
JUUTAKUSASAERUKINGAKU_W || ',' ||
JUTAKUSHOKEIHIMANNICHI || ',' ||
JUTAKUSHOKEIHIMANNICHI_W || ',' ||
JUTAKUKYOUEKIHIMANNICHI || ',' ||
JUTAKUKYOUEKIHIMANNICHI_W || ',' ||
JUUTAKUSASAERUWARIAI || ',' ||
JUUTAKUSASAERUWARIAI_W || ',' ||
SAKUSEISHAID || ',' ||
to_char( SAKUSEINICHIJI,'yyyy/mm/dd hh24:mi:ss')  || ',' ||
KOUSHINSHAID || ',' ||
to_char( KOUSHINNICHIJI,'yyyy/mm/dd hh24:mi:ss')
FROM L_CMSTT0601 ;

SPOOL OFF 
--------------------------------------------------
--------------------------------------------------
--L_CMSTT0602
SPOOL L_CMSTT0602.csv 

SELECT 
'COMPUTER_NAME' || ',' ||
'IP_ADRESS' || ',' ||
'OUTPUT_DATE' || ',' ||
'TORIATSUKAISHAID' || ',' ||
'KOKYAKUBANGOU' || ',' ||
'CARENBAN' || ',' ||
'TSUUJOUSHUBETSUCODE' || ',' ||
'RENBAN' || ',' ||
'MANNICHISASAERUUMUFLAG' || ',' ||
'RYOKOUSHURUICODE' || ',' ||
'RYOKOUMEI' || ',' ||
'YOTEINEN' || ',' ||
'YOTEINENKANKAKU' || ',' ||
'YOTEISAISHUUNEN' || ',' ||
'NENHYOUJICODE' || ',' ||
'HITSUYOUGAKU' || ',' ||
'SAKUSEISHAID' || ',' ||
'SAKUSEINICHIJI' || ',' ||
'KOUSHINSHAID' || ',' ||
'KOUSHINNICHIJI' 
FROM   dual;

SELECT 
COMPUTER_NAME || ',' ||
IP_ADRESS || ',' ||
to_char( OUTPUT_DATE,'yyyy/mm/dd hh24:mi:ss')  || ',' ||
TORIATSUKAISHAID || ',' ||
KOKYAKUBANGOU || ',' ||
CARENBAN || ',' ||
TSUUJOUSHUBETSUCODE || ',' ||
RENBAN || ',' ||
MANNICHISASAERUUMUFLAG || ',' ||
RYOKOUSHURUICODE || ',' ||
RYOKOUMEI || ',' ||
YOTEINEN || ',' ||
YOTEINENKANKAKU || ',' ||
YOTEISAISHUUNEN || ',' ||
NENHYOUJICODE || ',' ||
HITSUYOUGAKU || ',' ||
SAKUSEISHAID || ',' ||
to_char( SAKUSEINICHIJI,'yyyy/mm/dd hh24:mi:ss')  || ',' ||
KOUSHINSHAID || ',' ||
to_char( KOUSHINNICHIJI,'yyyy/mm/dd hh24:mi:ss')
FROM L_CMSTT0602 ;

SPOOL OFF 
--------------------------------------------------
--------------------------------------------------
--L_CMSTT0603
SPOOL L_CMSTT0603.csv 

SELECT 
'COMPUTER_NAME' || ',' ||
'IP_ADRESS' || ',' ||
'OUTPUT_DATE' || ',' ||
'TORIATSUKAISHAID' || ',' ||
'KOKYAKUBANGOU' || ',' ||
'CARENBAN' || ',' ||
'SEIMEIHOKENMAITSUKI' || ',' ||
'SEIMEIHOKENBONUSNATSU' || ',' ||
'SEIMEIHOKENBONUSFUYU' || ',' ||
'SEIMEIHOKENSONOTA' || ',' ||
'SEIMEIHOKENNENKANGOUKEI' || ',' ||
'NENKINHOKENMAITSUKI' || ',' ||
'NENKINHOKENBONUSNATSU' || ',' ||
'NENKINHOKENBONUSFUYU' || ',' ||
'NENKINHOKENSONOTA' || ',' ||
'NENKINHOKENNENKANGOUKEI' || ',' ||
'YOCHOKINZANDAKA' || ',' ||
'TEMOTOSHIKIN' || ',' ||
'TSUMITATEGAKUMAITSUKI' || ',' ||
'TSUMITATEGAKUBONUSNATSU' || ',' ||
'TSUMITATEGAKUBONUSFUYU' || ',' ||
'TSUMITATEGAKUSONOTANENKAN' || ',' ||
'NENKANTSUMITATEGAKU' || ',' ||
'NENSHUUKARASHISHUTSUGAKU' || ',' ||
'FUDOUSANGAKU' || ',' ||
'KABUSHIKIGAKU' || ',' ||
'JUNBIZUMISONOTASHIKIN' || ',' ||
'KARIIREKINGAKU' || ',' ||
'KARIIREKIKAN' || ',' ||
'KARIIRERIRITSU' || ',' ||
'TEINENTAISHOKUKINGAKU' || ',' ||
'TEINENTAISHOKUKINGAKU_W' || ',' ||
'NENSHUU' || ',' ||
'NENSHUUHAIGUUSHA' || ',' ||
'TEDORIGAKU' || ',' ||
'NENKINCODE' || ',' ||
'TEDORIGAKUHAIGUUSHA' || ',' ||
'NENKINCODEHIGUUSHA' || ',' ||
'NYUUINNICHIGAKU' || ',' ||
'NYUUINNICHIGAKU_W' || ',' ||
'SEIJINBYOUUMUFLAG' || ',' ||
'SEIJINBYOUUMUFLAG_W' || ',' ||
'KAIGOHOSHOUGAKUFLAG' || ',' ||
'KAIGOHOSHOUGAKUFLAG_W' || ',' ||
'TEDORIGAKUGOKEI' || ',' ||
'GENZAISEIKATSUHI' || ',' ||
'GENZAIHOKENRYOU' || ',' ||
'GENZAINENKANJUNBIGAKU' || ',' ||
'KONGOSEIKATSUHI' || ',' ||
'KONGOHOKENRYOU' || ',' ||
'KONGONENKANJUNBIGAKU' || ',' ||
'SAKUSEISHAID' || ',' ||
'SAKUSEINICHIJI' || ',' ||
'KOUSHINSHAID' || ',' ||
'KOUSHINNICHIJI' || ',' ||
'SHUNYUUHOSHOUJUNBIKIN' || ',' ||
'SHUNYUUHOSHOUJUNBIKIN_W' || ',' ||
'GANCHIRYOUJUNBIKIN' || ',' ||
'GANCHIRYOUJUNBIKIN_W' 
FROM   dual;

SELECT 
COMPUTER_NAME || ',' ||
IP_ADRESS || ',' ||
to_char( OUTPUT_DATE,'yyyy/mm/dd hh24:mi:ss')  || ',' ||
TORIATSUKAISHAID || ',' ||
KOKYAKUBANGOU || ',' ||
CARENBAN || ',' ||
SEIMEIHOKENMAITSUKI || ',' ||
SEIMEIHOKENBONUSNATSU || ',' ||
SEIMEIHOKENBONUSFUYU || ',' ||
SEIMEIHOKENSONOTA || ',' ||
SEIMEIHOKENNENKANGOUKEI || ',' ||
NENKINHOKENMAITSUKI || ',' ||
NENKINHOKENBONUSNATSU || ',' ||
NENKINHOKENBONUSFUYU || ',' ||
NENKINHOKENSONOTA || ',' ||
NENKINHOKENNENKANGOUKEI || ',' ||
YOCHOKINZANDAKA || ',' ||
TEMOTOSHIKIN || ',' ||
TSUMITATEGAKUMAITSUKI || ',' ||
TSUMITATEGAKUBONUSNATSU || ',' ||
TSUMITATEGAKUBONUSFUYU || ',' ||
TSUMITATEGAKUSONOTANENKAN || ',' ||
NENKANTSUMITATEGAKU || ',' ||
NENSHUUKARASHISHUTSUGAKU || ',' ||
FUDOUSANGAKU || ',' ||
KABUSHIKIGAKU || ',' ||
JUNBIZUMISONOTASHIKIN || ',' ||
KARIIREKINGAKU || ',' ||
KARIIREKIKAN || ',' ||
KARIIRERIRITSU || ',' ||
TEINENTAISHOKUKINGAKU || ',' ||
TEINENTAISHOKUKINGAKU_W || ',' ||
NENSHUU || ',' ||
NENSHUUHAIGUUSHA || ',' ||
TEDORIGAKU || ',' ||
NENKINCODE || ',' ||
TEDORIGAKUHAIGUUSHA || ',' ||
NENKINCODEHIGUUSHA || ',' ||
NYUUINNICHIGAKU || ',' ||
NYUUINNICHIGAKU_W || ',' ||
SEIJINBYOUUMUFLAG || ',' ||
SEIJINBYOUUMUFLAG_W || ',' ||
KAIGOHOSHOUGAKUFLAG || ',' ||
KAIGOHOSHOUGAKUFLAG_W || ',' ||
TEDORIGAKUGOKEI || ',' ||
GENZAISEIKATSUHI || ',' ||
GENZAIHOKENRYOU || ',' ||
GENZAINENKANJUNBIGAKU || ',' ||
KONGOSEIKATSUHI || ',' ||
KONGOHOKENRYOU || ',' ||
KONGONENKANJUNBIGAKU || ',' ||
SAKUSEISHAID || ',' ||
to_char( SAKUSEINICHIJI,'yyyy/mm/dd hh24:mi:ss')  || ',' ||
KOUSHINSHAID || ',' ||
to_char( KOUSHINNICHIJI,'yyyy/mm/dd hh24:mi:ss')  || ',' ||
SHUNYUUHOSHOUJUNBIKIN || ',' ||
SHUNYUUHOSHOUJUNBIKIN_W || ',' ||
GANCHIRYOUJUNBIKIN || ',' ||
GANCHIRYOUJUNBIKIN_W
FROM L_CMSTT0603 ;

SPOOL OFF 
--------------------------------------------------
--------------------------------------------------
--L_CMSTT0605
SPOOL L_CMSTT0605.csv 

SELECT 
'COMPUTER_NAME' || ',' ||
'IP_ADRESS' || ',' ||
'OUTPUT_DATE' || ',' ||
'TORIATSUKAISHAID' || ',' ||
'KOKYAKUBANGOU' || ',' ||
'CARENBAN' || ',' ||
'TSUUJOUSHUBETSUCODE' || ',' ||
'HITSUYOUSHIKINCODE' || ',' ||
'RENBAN' || ',' ||
'NENGOKINGAKU0' || ',' ||
'NENGOKINGAKU1' || ',' ||
'NENGOKINGAKU2' || ',' ||
'NENGOKINGAKU3' || ',' ||
'NENGOKINGAKU4' || ',' ||
'NENGOKINGAKU5' || ',' ||
'NENGOKINGAKU6' || ',' ||
'NENGOKINGAKU7' || ',' ||
'NENGOKINGAKU8' || ',' ||
'NENGOKINGAKU9' || ',' ||
'NENGOKINGAKU10' || ',' ||
'NENGOKINGAKU11' || ',' ||
'NENGOKINGAKU12' || ',' ||
'NENGOKINGAKU13' || ',' ||
'NENGOKINGAKU14' || ',' ||
'NENGOKINGAKU15' || ',' ||
'NENGOKINGAKU16' || ',' ||
'NENGOKINGAKU17' || ',' ||
'NENGOKINGAKU18' || ',' ||
'NENGOKINGAKU19' || ',' ||
'NENGOKINGAKU20' || ',' ||
'NENGOKINGAKU21' || ',' ||
'NENGOKINGAKU22' || ',' ||
'NENGOKINGAKU23' || ',' ||
'NENGOKINGAKU24' || ',' ||
'NENGOKINGAKU25' || ',' ||
'NENGOKINGAKU26' || ',' ||
'NENGOKINGAKU27' || ',' ||
'NENGOKINGAKU28' || ',' ||
'NENGOKINGAKU29' || ',' ||
'NENGOKINGAKU30' || ',' ||
'NENGOKINGAKU31' || ',' ||
'NENGOKINGAKU32' || ',' ||
'NENGOKINGAKU33' || ',' ||
'NENGOKINGAKU34' || ',' ||
'NENGOKINGAKU35' || ',' ||
'NENGOKINGAKU36' || ',' ||
'NENGOKINGAKU37' || ',' ||
'NENGOKINGAKU38' || ',' ||
'NENGOKINGAKU39' || ',' ||
'NENGOKINGAKU40' || ',' ||
'NENGOKINGAKU41' || ',' ||
'NENGOKINGAKU42' || ',' ||
'NENGOKINGAKU43' || ',' ||
'NENGOKINGAKU44' || ',' ||
'NENGOKINGAKU45' || ',' ||
'NENGOKINGAKU46' || ',' ||
'NENGOKINGAKU47' || ',' ||
'NENGOKINGAKU48' || ',' ||
'NENGOKINGAKU49' || ',' ||
'NENGOKINGAKU50' || ',' ||
'NENGOKINGAKU51' || ',' ||
'NENGOKINGAKU52' || ',' ||
'NENGOKINGAKU53' || ',' ||
'NENGOKINGAKU54' || ',' ||
'NENGOKINGAKU55' || ',' ||
'NENGOKINGAKU56' || ',' ||
'NENGOKINGAKU57' || ',' ||
'NENGOKINGAKU58' || ',' ||
'NENGOKINGAKU59' || ',' ||
'NENGOKINGAKU60' || ',' ||
'NENGOKINGAKU61' || ',' ||
'NENGOKINGAKU62' || ',' ||
'NENGOKINGAKU63' || ',' ||
'NENGOKINGAKU64' || ',' ||
'NENGOKINGAKU65' || ',' ||
'NENGOKINGAKU66' || ',' ||
'NENGOKINGAKU67' || ',' ||
'NENGOKINGAKU68' || ',' ||
'NENGOKINGAKU69' || ',' ||
'NENGOKINGAKU70' || ',' ||
'SAKUSEISHAID' || ',' ||
'SAKUSEINICHIJI' || ',' ||
'KOUSHINSHAID' || ',' ||
'KOUSHINNICHIJI' 
FROM   dual;

SELECT 
COMPUTER_NAME || ',' ||
IP_ADRESS || ',' ||
to_char( OUTPUT_DATE,'yyyy/mm/dd hh24:mi:ss')  || ',' ||
TORIATSUKAISHAID || ',' ||
KOKYAKUBANGOU || ',' ||
CARENBAN || ',' ||
TSUUJOUSHUBETSUCODE || ',' ||
HITSUYOUSHIKINCODE || ',' ||
RENBAN || ',' ||
NENGOKINGAKU0 || ',' ||
NENGOKINGAKU1 || ',' ||
NENGOKINGAKU2 || ',' ||
NENGOKINGAKU3 || ',' ||
NENGOKINGAKU4 || ',' ||
NENGOKINGAKU5 || ',' ||
NENGOKINGAKU6 || ',' ||
NENGOKINGAKU7 || ',' ||
NENGOKINGAKU8 || ',' ||
NENGOKINGAKU9 || ',' ||
NENGOKINGAKU10 || ',' ||
NENGOKINGAKU11 || ',' ||
NENGOKINGAKU12 || ',' ||
NENGOKINGAKU13 || ',' ||
NENGOKINGAKU14 || ',' ||
NENGOKINGAKU15 || ',' ||
NENGOKINGAKU16 || ',' ||
NENGOKINGAKU17 || ',' ||
NENGOKINGAKU18 || ',' ||
NENGOKINGAKU19 || ',' ||
NENGOKINGAKU20 || ',' ||
NENGOKINGAKU21 || ',' ||
NENGOKINGAKU22 || ',' ||
NENGOKINGAKU23 || ',' ||
NENGOKINGAKU24 || ',' ||
NENGOKINGAKU25 || ',' ||
NENGOKINGAKU26 || ',' ||
NENGOKINGAKU27 || ',' ||
NENGOKINGAKU28 || ',' ||
NENGOKINGAKU29 || ',' ||
NENGOKINGAKU30 || ',' ||
NENGOKINGAKU31 || ',' ||
NENGOKINGAKU32 || ',' ||
NENGOKINGAKU33 || ',' ||
NENGOKINGAKU34 || ',' ||
NENGOKINGAKU35 || ',' ||
NENGOKINGAKU36 || ',' ||
NENGOKINGAKU37 || ',' ||
NENGOKINGAKU38 || ',' ||
NENGOKINGAKU39 || ',' ||
NENGOKINGAKU40 || ',' ||
NENGOKINGAKU41 || ',' ||
NENGOKINGAKU42 || ',' ||
NENGOKINGAKU43 || ',' ||
NENGOKINGAKU44 || ',' ||
NENGOKINGAKU45 || ',' ||
NENGOKINGAKU46 || ',' ||
NENGOKINGAKU47 || ',' ||
NENGOKINGAKU48 || ',' ||
NENGOKINGAKU49 || ',' ||
NENGOKINGAKU50 || ',' ||
NENGOKINGAKU51 || ',' ||
NENGOKINGAKU52 || ',' ||
NENGOKINGAKU53 || ',' ||
NENGOKINGAKU54 || ',' ||
NENGOKINGAKU55 || ',' ||
NENGOKINGAKU56 || ',' ||
NENGOKINGAKU57 || ',' ||
NENGOKINGAKU58 || ',' ||
NENGOKINGAKU59 || ',' ||
NENGOKINGAKU60 || ',' ||
NENGOKINGAKU61 || ',' ||
NENGOKINGAKU62 || ',' ||
NENGOKINGAKU63 || ',' ||
NENGOKINGAKU64 || ',' ||
NENGOKINGAKU65 || ',' ||
NENGOKINGAKU66 || ',' ||
NENGOKINGAKU67 || ',' ||
NENGOKINGAKU68 || ',' ||
NENGOKINGAKU69 || ',' ||
NENGOKINGAKU70 || ',' ||
SAKUSEISHAID || ',' ||
to_char( SAKUSEINICHIJI,'yyyy/mm/dd hh24:mi:ss')  || ',' ||
KOUSHINSHAID || ',' ||
to_char( KOUSHINNICHIJI,'yyyy/mm/dd hh24:mi:ss')
FROM L_CMSTT0605 ;

SPOOL OFF 
--------------------------------------------------
--------------------------------------------------
--L_CMSTT0606
SPOOL L_CMSTT0606.csv 

SELECT 
'COMPUTER_NAME' || ',' ||
'IP_ADRESS' || ',' ||
'OUTPUT_DATE' || ',' ||
'TORIATSUKAISHAID' || ',' ||
'KOKYAKUBANGOU' || ',' ||
'CARENBAN' || ',' ||
'TSUUJOUSHUBETSUCODE' || ',' ||
'RENBAN' || ',' ||
'MANNICHISASAERUUMUFLAG' || ',' ||
'TAIKYUUZAIMEI' || ',' ||
'YOTEINEN' || ',' ||
'YOTEINENKANKAKU' || ',' ||
'YOTEINENSAISHUUNEN' || ',' ||
'NENHYOUJICODE' || ',' ||
'HITSUYOUGAKU' || ',' ||
'GENZAILOANGAKU' || ',' ||
'GENZAILOANKIKAN' || ',' ||
'EVENTHASSEIKAISUU' || ',' ||
'LOANTEKIYOUKAISUU' || ',' ||
'ATAMAKIN' || ',' ||
'ATAMAKINWARIAI' || ',' ||
'LOANGAKU' || ',' ||
'LOANKIKAN' || ',' ||
'LOANRIRITSU' || ',' ||
'SAKUSEISHAID' || ',' ||
'SAKUSEINICHIJI' || ',' ||
'KOUSHINSHAID' || ',' ||
'KOUSHINNICHIJI' 
FROM   dual;

SELECT 
COMPUTER_NAME || ',' ||
IP_ADRESS || ',' ||
to_char( OUTPUT_DATE,'yyyy/mm/dd hh24:mi:ss')  || ',' ||
TORIATSUKAISHAID || ',' ||
KOKYAKUBANGOU || ',' ||
CARENBAN || ',' ||
TSUUJOUSHUBETSUCODE || ',' ||
RENBAN || ',' ||
MANNICHISASAERUUMUFLAG || ',' ||
TAIKYUUZAIMEI || ',' ||
YOTEINEN || ',' ||
YOTEINENKANKAKU || ',' ||
YOTEINENSAISHUUNEN || ',' ||
NENHYOUJICODE || ',' ||
HITSUYOUGAKU || ',' ||
GENZAILOANGAKU || ',' ||
GENZAILOANKIKAN || ',' ||
EVENTHASSEIKAISUU || ',' ||
LOANTEKIYOUKAISUU || ',' ||
ATAMAKIN || ',' ||
ATAMAKINWARIAI || ',' ||
LOANGAKU || ',' ||
LOANKIKAN || ',' ||
LOANRIRITSU || ',' ||
SAKUSEISHAID || ',' ||
to_char( SAKUSEINICHIJI,'yyyy/mm/dd hh24:mi:ss')  || ',' ||
KOUSHINSHAID || ',' ||
to_char( KOUSHINNICHIJI,'yyyy/mm/dd hh24:mi:ss')
FROM L_CMSTT0606 ;

SPOOL OFF 
--------------------------------------------------
--------------------------------------------------
--L_CMSTT0607
SPOOL L_CMSTT0607.csv 

SELECT 
'COMPUTER_NAME' || ',' ||
'IP_ADRESS' || ',' ||
'OUTPUT_DATE' || ',' ||
'TORIATSUKAISHAID' || ',' ||
'KOKYAKUBANGOU' || ',' ||
'CARENBAN' || ',' ||
'HONNINHAIGUUSHAKUBUNCODE' || ',' ||
'TAISHOKUNENREI' || ',' ||
'SECONDLIFENENREI' || ',' ||
'SECONDLIFEHITSUYOUGAKU' || ',' ||
'SAKUSEISHAID' || ',' ||
'SAKUSEINICHIJI' || ',' ||
'KOUSHINSHAID' || ',' ||
'KOUSHINNICHIJI' 
FROM   dual;

SELECT 
COMPUTER_NAME || ',' ||
IP_ADRESS || ',' ||
to_char( OUTPUT_DATE,'yyyy/mm/dd hh24:mi:ss')  || ',' ||
TORIATSUKAISHAID || ',' ||
KOKYAKUBANGOU || ',' ||
CARENBAN || ',' ||
HONNINHAIGUUSHAKUBUNCODE || ',' ||
TAISHOKUNENREI || ',' ||
SECONDLIFENENREI || ',' ||
SECONDLIFEHITSUYOUGAKU || ',' ||
SAKUSEISHAID || ',' ||
to_char( SAKUSEINICHIJI,'yyyy/mm/dd hh24:mi:ss')  || ',' ||
KOUSHINSHAID || ',' ||
to_char( KOUSHINNICHIJI,'yyyy/mm/dd hh24:mi:ss')
FROM L_CMSTT0607 ;

SPOOL OFF 
--------------------------------------------------
--------------------------------------------------
--L_CMSTT0608
SPOOL L_CMSTT0608.csv 

SELECT 
'COMPUTER_NAME' || ',' ||
'IP_ADRESS' || ',' ||
'OUTPUT_DATE' || ',' ||
'TORIATSUKAISHAID' || ',' ||
'KOKYAKUBANGOU' || ',' ||
'CARENBAN' || ',' ||
'TSUUJOUSHUBETSUCODE' || ',' ||
'RENBAN' || ',' ||
'SASAERUHITSUYOUUMUCODE' || ',' ||
'YUMENAIYOU' || ',' ||
'YOTEINEN' || ',' ||
'YOTEINENKANKAKU' || ',' ||
'YOTEISAISHUUNEN' || ',' ||
'NENHYOUJICODE' || ',' ||
'HITSUYOUGAKU' || ',' ||
'GENZAILOANGAKU' || ',' ||
'EVENTHASSEIKAISUU' || ',' ||
'LOANTEKIYOUKAISUU' || ',' ||
'GENZAILOANKIKAN' || ',' ||
'ATAMAKIN' || ',' ||
'ATAMAKINWARIAI' || ',' ||
'LOANGAKU' || ',' ||
'LOANKIKAN' || ',' ||
'LOANRIRITSU' || ',' ||
'SAKUSEISHAID' || ',' ||
'SAKUSEINICHIJI' || ',' ||
'KOUSHINSHAID' || ',' ||
'KOUSHINNICHIJI' 
FROM   dual;

SELECT 
COMPUTER_NAME || ',' ||
IP_ADRESS || ',' ||
to_char( OUTPUT_DATE,'yyyy/mm/dd hh24:mi:ss')  || ',' ||
TORIATSUKAISHAID || ',' ||
KOKYAKUBANGOU || ',' ||
CARENBAN || ',' ||
TSUUJOUSHUBETSUCODE || ',' ||
RENBAN || ',' ||
SASAERUHITSUYOUUMUCODE || ',' ||
YUMENAIYOU || ',' ||
YOTEINEN || ',' ||
YOTEINENKANKAKU || ',' ||
YOTEISAISHUUNEN || ',' ||
NENHYOUJICODE || ',' ||
HITSUYOUGAKU || ',' ||
GENZAILOANGAKU || ',' ||
EVENTHASSEIKAISUU || ',' ||
LOANTEKIYOUKAISUU || ',' ||
GENZAILOANKIKAN || ',' ||
ATAMAKIN || ',' ||
ATAMAKINWARIAI || ',' ||
LOANGAKU || ',' ||
LOANKIKAN || ',' ||
LOANRIRITSU || ',' ||
SAKUSEISHAID || ',' ||
to_char( SAKUSEINICHIJI,'yyyy/mm/dd hh24:mi:ss')  || ',' ||
KOUSHINSHAID || ',' ||
to_char( KOUSHINNICHIJI,'yyyy/mm/dd hh24:mi:ss')
FROM L_CMSTT0608 ;

SPOOL OFF 
--------------------------------------------------
--------------------------------------------------
--L_CMSTT0610
SPOOL L_CMSTT0610.csv 

SELECT 
'COMPUTER_NAME' || ',' ||
'IP_ADRESS' || ',' ||
'OUTPUT_DATE' || ',' ||
'TORIATSUKAISHAID' || ',' ||
'KOKYAKUBANGOU' || ',' ||
'CARENBAN' || ',' ||
'CADATASAKUSEINENGAPPI' || ',' ||
'CADATAKOUSHINNENGAPPI' || ',' ||
'BUNSEKIKIJUNNENGAPPI' || ',' ||
'CAYOUKANA' || ',' ||
'CAYOUKANJI' || ',' ||
'SEIBETSUCODE' || ',' ||
'SEINENGAPPI' || ',' ||
'NENREI' || ',' ||
'HAIGUUSHAUMUFLAG' || ',' ||
'KEKKONYOTEIUMUFLAG' || ',' ||
'KEKKONNENREI' || ',' ||
'KEKKONHITSUYOUGAKU' || ',' ||
'HAIGUUSHAJITSUZAIFLAG' || ',' ||
'HAIGUUSHAKOKYAKUBANGOU' || ',' ||
'HAIGUUSHACAYOUKANA' || ',' ||
'HAIGUUSHACAYOUKANJI' || ',' ||
'HAIGUUSHASEIBETSUCODE' || ',' ||
'HAIGUUSHASEINENGAPPI' || ',' ||
'HAIGUUSHANENREI' || ',' ||
'HAIGUUSHASHIGOTOUMUFLAG' || ',' ||
'KODOMOUMUFLAG' || ',' ||
'KODOMOYOTEIUMUFLAG' || ',' ||
'CAMEMO' || ',' ||
'KYOUIKUEVENTUMU' || ',' ||
'KEKKONEVENTUMU' || ',' ||
'JUUTAKUEVENTUMU' || ',' ||
'RYOKOUEVENTUMU' || ',' ||
'TAIKYUUZAIEVENTUMU' || ',' ||
'SECONDLIFEEVENTUMU' || ',' ||
'SONOTAEVENTUMU' || ',' ||
'KYOUIKUGRAPHUMU' || ',' ||
'KEKKONNGRAPHUMU' || ',' ||
'JYUUTAKUGRAPHUMU' || ',' ||
'RYOKOUGRAPHUMU' || ',' ||
'TAIKYUUZAIGRAPHUMU' || ',' ||
'SEKANDORAIFUGRAPHUMU' || ',' ||
'SONOTAGRAPHUMU' || ',' ||
'KYOUIKUHITSUYOUGOUKEI' || ',' ||
'KEKKONHITSUYOUGOUKEI' || ',' ||
'JUUTAKUHITSUYOUGOUKEI' || ',' ||
'RYOKOUHITSUYOUGOUKEI' || ',' ||
'TAIKYUUZAIHITSUYOUGOUKEI' || ',' ||
'SECONDLIFEHITSUYOUGOUKEI' || ',' ||
'SONOTAHITSUYOUGOUKEI' || ',' ||
'SONOTAKEIKAKUFLAG' || ',' ||
'KOJINNENKINUMUFLAG' || ',' ||
'KIGYOUNENKINUMUFLAG' || ',' ||
'SONOTAHOYUUSHISANUMUFLAG' || ',' ||
'MANNICHINENREI' || ',' ||
'MANNICHINENREIHAIGUUSHA' || ',' ||
'S_HKHOUSHUUGETUGAKU_KOUSEI' || ',' ||
'S_HKHOUSHUUGAKU_KOUSEI' || ',' ||
'S_KANYUUGETUSUU_KOUSEI' || ',' ||
'H_HKHOUSHUUGETUGAKU_KOUSEI' || ',' ||
'H_HKHOUSHUUGAKU_KOUSEI' || ',' ||
'H_KANYUUGETUSUU_KOUSEI' || ',' ||
'S_HKHOUSHUUGETUGAKU_KYOUSAI' || ',' ||
'S_HKHOUSHUUGAKU_KYOUSAI' || ',' ||
'S_KANYUUGETUSUU_KYOUSAI' || ',' ||
'H_HKHOUSHUUGETUGAKU_KYOUSAI' || ',' ||
'H_HKHOUSHUUGAKU_KYOUSAI' || ',' ||
'H_KANYUUGETUSUU_KYOUSAI' || ',' ||
'S_HKHOUSHUUGETUGAKU_KOUSEI1' || ',' ||
'S_HKHOUSHUUGAKU_KOUSEI1' || ',' ||
'S_KANYUUGETUSUU_KOUSEI1' || ',' ||
'H_HKHOUSHUUGETUGAKU_KOUSEI1' || ',' ||
'H_HKHOUSHUUGAKU_KOUSEI1' || ',' ||
'H_KANYUUGETUSUU_KOUSEI1' || ',' ||
'S_HKHOUSHUUGETUGAKU_KYOUSAI1' || ',' ||
'S_HKHOUSHUUGAKU_KYOUSAI1' || ',' ||
'S_KANYUUGETUSUU_KYOUSAI1' || ',' ||
'H_HKHOUSHUUGETUGAKU_KYOUSAI1' || ',' ||
'H_HKHOUSHUUGAKU_KYOUSAI1' || ',' ||
'H_KANYUUGETUSUU_KYOUSAI1' || ',' ||
'S_HKHOUSHUUGETUGAKU_KOUSEI2' || ',' ||
'S_HKHOUSHUUGAKU_KOUSEI2' || ',' ||
'S_KANYUUGETUSUU_KOUSEI2' || ',' ||
'H_HKHOUSHUUGETUGAKU_KOUSEI2' || ',' ||
'H_HKHOUSHUUGAKU_KOUSEI2' || ',' ||
'H_KANYUUGETUSUU_KOUSEI2' || ',' ||
'S_HKHOUSHUUGETUGAKU_KYOUSAI2' || ',' ||
'S_HKHOUSHUUGAKU_KYOUSAI2' || ',' ||
'S_KANYUUGETUSUU_KYOUSAI2' || ',' ||
'H_HKHOUSHUUGETUGAKU_KYOUSAI2' || ',' ||
'H_HKHOUSHUUGAKU_KYOUSAI2' || ',' ||
'H_KANYUUGETUSUU_KYOUSAI2' || ',' ||
'YUUSENJUNIKYOUIKU' || ',' ||
'YUUSENJUNIKEKKON' || ',' ||
'YUUSENJUNIJUUTAKU' || ',' ||
'YUUSENJUNIRYOKOU' || ',' ||
'YUUSENJUNITAIKYUUZAI' || ',' ||
'YUUSENJUNISECONDLIFE' || ',' ||
'YUUSENJUNISONOTA' || ',' ||
'KYOUIKUJOUSHOURITSU' || ',' ||
'KEKKONJOUSHOURITSU' || ',' ||
'JUUTAKUJOUSHOURITSU' || ',' ||
'RYOKOUJOUSHOURITSU' || ',' ||
'TAIKYUUZAIJOUSHOURITSU' || ',' ||
'SECONDLIFEJOUSHOURITSU' || ',' ||
'SONOTAJOUSHOURITSU' || ',' ||
'SOUGOUJOUSHOURITSU' || ',' ||
'HONNINYOCHOKINUMUFLAG' || ',' ||
'HAIGUUSHAYOCHOKINUMUFLAG' || ',' ||
'DATACOPYJOUTAICODE' || ',' ||
'KYOUIKUKEISANFLAG' || ',' ||
'KEKKONKEISANFLAG' || ',' ||
'JUUTAKUKEISANFLAG' || ',' ||
'RYOKOUKEISANFLAG' || ',' ||
'TAIKYUUZAIKEISANFLAG' || ',' ||
'SECONDLIFEKEISANFLAG' || ',' ||
'SONOTAKEISANFLAG' || ',' ||
'SAKUSEISHAID' || ',' ||
'SAKUSEINICHIJI' || ',' ||
'KOUSHINSHAID' || ',' ||
'KOUSHINNICHIJI' 
FROM   dual;

SELECT 
COMPUTER_NAME || ',' ||
IP_ADRESS || ',' ||
to_char( OUTPUT_DATE,'yyyy/mm/dd hh24:mi:ss')  || ',' ||
TORIATSUKAISHAID || ',' ||
KOKYAKUBANGOU || ',' ||
CARENBAN || ',' ||
to_char( CADATASAKUSEINENGAPPI,'yyyy/mm/dd hh24:mi:ss')  || ',' ||
to_char( CADATAKOUSHINNENGAPPI,'yyyy/mm/dd hh24:mi:ss')  || ',' ||
to_char( BUNSEKIKIJUNNENGAPPI,'yyyy/mm/dd hh24:mi:ss')  || ',' ||
CAYOUKANA || ',' ||
CAYOUKANJI || ',' ||
SEIBETSUCODE || ',' ||
to_char( SEINENGAPPI,'yyyy/mm/dd hh24:mi:ss')  || ',' ||
NENREI || ',' ||
HAIGUUSHAUMUFLAG || ',' ||
KEKKONYOTEIUMUFLAG || ',' ||
KEKKONNENREI || ',' ||
KEKKONHITSUYOUGAKU || ',' ||
HAIGUUSHAJITSUZAIFLAG || ',' ||
HAIGUUSHAKOKYAKUBANGOU || ',' ||
HAIGUUSHACAYOUKANA || ',' ||
HAIGUUSHACAYOUKANJI || ',' ||
HAIGUUSHASEIBETSUCODE || ',' ||
to_char( HAIGUUSHASEINENGAPPI,'yyyy/mm/dd hh24:mi:ss')  || ',' ||
HAIGUUSHANENREI || ',' ||
HAIGUUSHASHIGOTOUMUFLAG || ',' ||
KODOMOUMUFLAG || ',' ||
KODOMOYOTEIUMUFLAG || ',' ||
CAMEMO || ',' ||
KYOUIKUEVENTUMU || ',' ||
KEKKONEVENTUMU || ',' ||
JUUTAKUEVENTUMU || ',' ||
RYOKOUEVENTUMU || ',' ||
TAIKYUUZAIEVENTUMU || ',' ||
SECONDLIFEEVENTUMU || ',' ||
SONOTAEVENTUMU || ',' ||
KYOUIKUGRAPHUMU || ',' ||
KEKKONNGRAPHUMU || ',' ||
JYUUTAKUGRAPHUMU || ',' ||
RYOKOUGRAPHUMU || ',' ||
TAIKYUUZAIGRAPHUMU || ',' ||
SEKANDORAIFUGRAPHUMU || ',' ||
SONOTAGRAPHUMU || ',' ||
KYOUIKUHITSUYOUGOUKEI || ',' ||
KEKKONHITSUYOUGOUKEI || ',' ||
JUUTAKUHITSUYOUGOUKEI || ',' ||
RYOKOUHITSUYOUGOUKEI || ',' ||
TAIKYUUZAIHITSUYOUGOUKEI || ',' ||
SECONDLIFEHITSUYOUGOUKEI || ',' ||
SONOTAHITSUYOUGOUKEI || ',' ||
SONOTAKEIKAKUFLAG || ',' ||
KOJINNENKINUMUFLAG || ',' ||
KIGYOUNENKINUMUFLAG || ',' ||
SONOTAHOYUUSHISANUMUFLAG || ',' ||
MANNICHINENREI || ',' ||
MANNICHINENREIHAIGUUSHA || ',' ||
S_HKHOUSHUUGETUGAKU_KOUSEI || ',' ||
S_HKHOUSHUUGAKU_KOUSEI || ',' ||
S_KANYUUGETUSUU_KOUSEI || ',' ||
H_HKHOUSHUUGETUGAKU_KOUSEI || ',' ||
H_HKHOUSHUUGAKU_KOUSEI || ',' ||
H_KANYUUGETUSUU_KOUSEI || ',' ||
S_HKHOUSHUUGETUGAKU_KYOUSAI || ',' ||
S_HKHOUSHUUGAKU_KYOUSAI || ',' ||
S_KANYUUGETUSUU_KYOUSAI || ',' ||
H_HKHOUSHUUGETUGAKU_KYOUSAI || ',' ||
H_HKHOUSHUUGAKU_KYOUSAI || ',' ||
H_KANYUUGETUSUU_KYOUSAI || ',' ||
S_HKHOUSHUUGETUGAKU_KOUSEI1 || ',' ||
S_HKHOUSHUUGAKU_KOUSEI1 || ',' ||
S_KANYUUGETUSUU_KOUSEI1 || ',' ||
H_HKHOUSHUUGETUGAKU_KOUSEI1 || ',' ||
H_HKHOUSHUUGAKU_KOUSEI1 || ',' ||
H_KANYUUGETUSUU_KOUSEI1 || ',' ||
S_HKHOUSHUUGETUGAKU_KYOUSAI1 || ',' ||
S_HKHOUSHUUGAKU_KYOUSAI1 || ',' ||
S_KANYUUGETUSUU_KYOUSAI1 || ',' ||
H_HKHOUSHUUGETUGAKU_KYOUSAI1 || ',' ||
H_HKHOUSHUUGAKU_KYOUSAI1 || ',' ||
H_KANYUUGETUSUU_KYOUSAI1 || ',' ||
S_HKHOUSHUUGETUGAKU_KOUSEI2 || ',' ||
S_HKHOUSHUUGAKU_KOUSEI2 || ',' ||
S_KANYUUGETUSUU_KOUSEI2 || ',' ||
H_HKHOUSHUUGETUGAKU_KOUSEI2 || ',' ||
H_HKHOUSHUUGAKU_KOUSEI2 || ',' ||
H_KANYUUGETUSUU_KOUSEI2 || ',' ||
S_HKHOUSHUUGETUGAKU_KYOUSAI2 || ',' ||
S_HKHOUSHUUGAKU_KYOUSAI2 || ',' ||
S_KANYUUGETUSUU_KYOUSAI2 || ',' ||
H_HKHOUSHUUGETUGAKU_KYOUSAI2 || ',' ||
H_HKHOUSHUUGAKU_KYOUSAI2 || ',' ||
H_KANYUUGETUSUU_KYOUSAI2 || ',' ||
YUUSENJUNIKYOUIKU || ',' ||
YUUSENJUNIKEKKON || ',' ||
YUUSENJUNIJUUTAKU || ',' ||
YUUSENJUNIRYOKOU || ',' ||
YUUSENJUNITAIKYUUZAI || ',' ||
YUUSENJUNISECONDLIFE || ',' ||
YUUSENJUNISONOTA || ',' ||
KYOUIKUJOUSHOURITSU || ',' ||
KEKKONJOUSHOURITSU || ',' ||
JUUTAKUJOUSHOURITSU || ',' ||
RYOKOUJOUSHOURITSU || ',' ||
TAIKYUUZAIJOUSHOURITSU || ',' ||
SECONDLIFEJOUSHOURITSU || ',' ||
SONOTAJOUSHOURITSU || ',' ||
SOUGOUJOUSHOURITSU || ',' ||
HONNINYOCHOKINUMUFLAG || ',' ||
HAIGUUSHAYOCHOKINUMUFLAG || ',' ||
DATACOPYJOUTAICODE || ',' ||
KYOUIKUKEISANFLAG || ',' ||
KEKKONKEISANFLAG || ',' ||
JUUTAKUKEISANFLAG || ',' ||
RYOKOUKEISANFLAG || ',' ||
TAIKYUUZAIKEISANFLAG || ',' ||
SECONDLIFEKEISANFLAG || ',' ||
SONOTAKEISANFLAG || ',' ||
SAKUSEISHAID || ',' ||
to_char( SAKUSEINICHIJI,'yyyy/mm/dd hh24:mi:ss')  || ',' ||
KOUSHINSHAID || ',' ||
to_char( KOUSHINNICHIJI,'yyyy/mm/dd hh24:mi:ss')
FROM L_CMSTT0610 ;

SPOOL OFF 
--------------------------------------------------
--------------------------------------------------
--L_CMSTT0622
SPOOL L_CMSTT0622.csv 

SELECT 
'COMPUTER_NAME' || ',' ||
'IP_ADRESS' || ',' ||
'OUTPUT_DATE' || ',' ||
'ToriatsukaishaID' || ',' ||
'KokyakuBangou' || ',' ||
'CARenban' || ',' ||
'CommentShubetsuCode' || ',' ||
'KaikakuJiki' || ',' ||
'KaikakuTaishouCode' || ',' ||
'ActionMongonn' || ',' ||
'CommentNaiyou' || ',' ||
'SakuseishaID' || ',' ||
'SakuseiNichiji' || ',' ||
'KoushinshaID' || ',' ||
'KoushinNichiji' || ',' ||
'' || ',' ||
'' || ',' ||
'' || ',' ||
'' || ',' ||
'' || ',' ||
'' || ',' ||
'' || ',' ||
'' || ',' ||
'' || ',' ||
'' || ',' ||
'' || ',' ||
'' || ',' ||
'' || ',' ||
'' || ',' ||
'' || ',' ||
'' || ',' ||
'' || ',' ||
'' || ',' ||
'' || ',' ||
'' || ',' ||
'' || ',' ||
'' || ',' ||
'' || ',' ||
'' || ',' ||
'' || ',' ||
'' || ',' ||
'' 
FROM   dual;

SELECT 
COMPUTER_NAME || ',' ||
IP_ADRESS || ',' ||
to_char( OUTPUT_DATE,'yyyy/mm/dd hh24:mi:ss')  || ',' ||
ToriatsukaishaID || ',' ||
KokyakuBangou || ',' ||
CARenban || ',' ||
CommentShubetsuCode || ',' ||
KaikakuJiki || ',' ||
KaikakuTaishouCode || ',' ||
ActionMongonn || ',' ||
CommentNaiyou || ',' ||
SakuseishaID || ',' ||
SakuseiNichiji || ',' ||
KoushinshaID || ',' ||
KoushinNichiji || ',' ||
 || ',' ||
 || ',' ||
 || ',' ||
 || ',' ||
 || ',' ||
 || ',' ||
 || ',' ||
 || ',' ||
 || ',' ||
 || ',' ||
 || ',' ||
 || ',' ||
 || ',' ||
 || ',' ||
 || ',' ||
 || ',' ||
 || ',' ||
 || ',' ||
 || ',' ||
 || ',' ||
 || ',' ||
 || ',' ||
 || ',' ||
 || ',' ||
 || ',' ||
 || ',' ||

FROM L_CMSTT0622 ;

SPOOL OFF 
--------------------------------------------------
--------------------------------------------------
--L_CMSTT0630
SPOOL L_CMSTT0630.csv 

SELECT 
'COMPUTER_NAME' || ',' ||
'IP_ADRESS' || ',' ||
'OUTPUT_DATE' || ',' ||
'TORIATSUKAISHAID' || ',' ||
'KOKYAKUBANGOU' || ',' ||
'KINENBISHUBETSUCODE' || ',' ||
'RENBAN' || ',' ||
'KINENBI' || ',' ||
'SAKUSEISHAID' || ',' ||
'SAKUSEINICHIJI' || ',' ||
'KOUSHINSHAID' || ',' ||
'KOUSHINNICHIJI' 
FROM   dual;

SELECT 
COMPUTER_NAME || ',' ||
IP_ADRESS || ',' ||
to_char( OUTPUT_DATE,'yyyy/mm/dd hh24:mi:ss')  || ',' ||
TORIATSUKAISHAID || ',' ||
KOKYAKUBANGOU || ',' ||
KINENBISHUBETSUCODE || ',' ||
RENBAN || ',' ||
to_char( KINENBI,'yyyy/mm/dd hh24:mi:ss')  || ',' ||
SAKUSEISHAID || ',' ||
to_char( SAKUSEINICHIJI,'yyyy/mm/dd hh24:mi:ss')  || ',' ||
KOUSHINSHAID || ',' ||
to_char( KOUSHINNICHIJI,'yyyy/mm/dd hh24:mi:ss')
FROM L_CMSTT0630 ;

SPOOL OFF 
--------------------------------------------------



SET ECHO ON 
SET FEEDBACK ON 
SET HEADING ON 
SET PAGESIZE 24
SET TERMOUT ON 
SET TRIMSPOOL OFF 