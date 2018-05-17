package astix.lt_foods_so;

import android.net.Uri;

import java.io.File;

public class CommonInfo
{

	// Its for Live Path on 194 Server



	public static String AppLatLngJsonFile="LTFoodsLatLngJson";

	public static File imageF_savedInstance=null;
	public static String imageName_savedInstance=null;
	public static String clickedTagPhoto_savedInstance=null;
	public static Uri uriSavedImage_savedInstance=null;

	public static String imei="";

	public static String fileContent="";
	public static final String MejiDairyPreference="MejiDairyPreference";

	public static String WebManageDSRUrl="http://103.20.212.194/LTACE/pda/frmIMEImanagement.aspx";
    public static String WebServicePath="http://103.20.212.194/WebServiceAndroidLTFoodsLive/Service.asmx";

    public static int DistanceRange=500;//Defautl Distance Range to show for store list


    public static String VersionDownloadPath="http://103.20.212.194/downloads/";
	public static String VersionDownloadAPKName="LTAceSOStoreMapping.apk";
	//public static String VersionDownloadAPKName="LTAceSO.apk"; // this name change according to varun sir mail on 16 jan 2018
	
	public static String DATABASE_NAME = "DBAdapterLtFoods";
	public static int AnyVisit = 0; 
	    
	public static int DATABASE_VERSIONID = 54;      // put this field value based on value in table on the server
	public static String AppVersionID = "1.13";   // put this field value based on value in table on the server
	public static int Application_TypeID = 3; //1=Parag Store Mapping,2=Parag SFA Indirect,3=Parag SFA Direct
	
	
	public static String OrderSyncPath="http://103.20.212.194/ReadXML_LTFoodsLive/DefaultSO.aspx";
	public static String ImageSyncPath="http://103.20.212.194/ReadXML_LTFoodsImagesLive/Default.aspx";
	
    public static String OrderTextSyncPath="http://103.20.212.194/ReadTxtFileForLTFoodsSFALive/default.aspx";
		
	
	public static String InvoiceSyncPath="http://103.20.212.194/ReadXML_LTFoodsInvoiceLive/Default.aspx";
	public static String DistributorSyncPath="http://103.20.212.194/ReadXML_LTFoodsSFADistributionLive/Default.aspx";

	public static String URLImageLinkToViewStoreOverWebProtal="http://103.20.212.194/ltace/Reports/frmPDAImgsLive.aspx";
	public static String SalesPersonTodaysTargetMsg="";

	public static String OrderXMLFolder="LTAceXml";
	public static String ImagesnFolder="LTAceImages";

	public static int flgLTFoodsSOOnlineOffLine=0;
	public static int flgNewStoreORStoreValidation=0;
	public static String FinalLatLngJsonFile="LTFoodsFinalLatLngJson";










	//Its for Staging  Path on 194 server for SFA

/*
	public static String AppLatLngJsonFile="LTFoodsLatLngJson";
	public static File imageF_savedInstance=null;
	public static String imageName_savedInstance=null;
	public static String clickedTagPhoto_savedInstance=null;
	public static Uri uriSavedImage_savedInstance=null;

	public static String imei="";

	public static String fileContent="";
	public static final String MejiDairyPreference="MejiDairyPreference";

	public static String WebManageDSRUrl="http://103.20.212.194/LTACE_Staging/pda/frmIMEImanagement.aspx";

	public static String WebServicePath="http://103.20.212.194/WebServiceAndroidLTFoodsStaging/Service.asmx";

	public static int DistanceRange=500; //Defautl Distance Range to show for store list


	public static String VersionDownloadPath="http://103.20.212.194/downloads/";
	public static String VersionDownloadAPKName="LTAceSOStoreMappingStaging.apk";
	//public static String VersionDownloadAPKName="LTAceSOStaging.apk"; // this name change according to varun sir mail on 16 jan 2018


	public static String DATABASE_NAME = "DBAdapterLtFoods";
	public static int AnyVisit = 0;

	public static int DATABASE_VERSIONID = 67;      // put this field value based on value in table on the server
	public static String AppVersionID= "1.12";   // put this field value based on value in table on the server
	public static int Application_TypeID = 3; //1=Parag Store Mapping,2=Parag SFA Indirect,3=Parag SFA Direct


	public static String OrderSyncPath="http://103.20.212.194/ReadXML_LTFoodsStaging/DefaultSO.aspx";
	public static String ImageSyncPath="http://103.20.212.194/ReadXML_LTFoodsImagesStaging/Default.aspx";

	public static String OrderTextSyncPath="http://103.20.212.194/ReadTxtFileForLTFoodsSFAStaging/default.aspx";


	public static String InvoiceSyncPath="http://103.20.212.194/ReadXML_LTFoodsInvoiceStaging/Default.aspx";
	public static String DistributorSyncPath="http://103.20.212.194/ReadXML_LTFoodsSFADistributionStaging/Default.aspx";

	public static String URLImageLinkToViewStoreOverWebProtal="http://103.20.212.194/ltace/Reports/frmPDAImgsStaging.aspx";
	public static String SalesPersonTodaysTargetMsg="";

	public static String OrderXMLFolder="LTAceXml";
	public static String ImagesnFolder="LTAceImages";

	public static int flgLTFoodsSOOnlineOffLine=0;
	public static int flgNewStoreORStoreValidation=0;
	public static String FinalLatLngJsonFile="LTFoodsFinalLatLngJson";
*/


	// Its for Test  Path on 194 server for SFA


/*


	public static String AppLatLngJsonFile="LTFoodsLatLngJson";
	public static File imageF_savedInstance=null;
	public static String imageName_savedInstance=null;
	public static String clickedTagPhoto_savedInstance=null;
	public static Uri uriSavedImage_savedInstance=null;

	public static String imei="";

	public static String fileContent="";
	public static final String MejiDairyPreference="MejiDairyPreference";


	public static String WebManageDSRUrl="http://103.20.212.194/LTACE_test/pda/frmIMEImanagement.aspx";
    public static String WebServicePath="http://103.20.212.194/WebServiceAndroidLTFoodsTest/Service.asmx";

	public static int DistanceRange=500;//Defautl Distance Range to show for store list


	public static String VersionDownloadPath="http://103.20.212.194/downloads/";
	public static String VersionDownloadAPKName="LTAceSOStoreMappingTest.apk";
	//public static String VersionDownloadAPKName="LTAceSOTest.apk"; // this name change according to varun sir mail on 16 jan 2018


	public static String DATABASE_NAME = "DBAdapterLtFoods";
	public static int AnyVisit = 0;

	public static int DATABASE_VERSIONID = 46;    // put this field value based on value in table on the server
	public static String AppVersionID = "1.13";   // put this field value based on value in table on the server
	public static int Application_TypeID = 3;   //1=Parag Store Mapping,2=Parag SFA Indirect,3=Parag SFA Direct

	public static String OrderSyncPath="http://103.20.212.194/ReadXML_LTFoodsTest/DefaultSO.aspx";
	public static String ImageSyncPath="http://103.20.212.194/ReadXML_LTFoodsImagesTest/Default.aspx";

	public static String OrderTextSyncPath="http://103.20.212.194/ReadTxtFileForLTFoodsSFATest/default.aspx";


	public static String InvoiceSyncPath="http://103.20.212.194/ReadXML_LTFoodsInvoiceTest/Default.aspx";
	public static String DistributorSyncPath="http://103.20.212.194/ReadXML_LTFoodsSFADistributionTest/Default.aspx";

	public static String URLImageLinkToViewStoreOverWebProtal="http://103.20.212.194/ltace/Reports/frmPDAImgsTest.aspx";
	public static String SalesPersonTodaysTargetMsg="";

	public static String OrderXMLFolder="LTAceXml";

	public static String ImagesnFolder="LTAceImages";

	public static int flgLTFoodsSOOnlineOffLine=0;
	public static int flgNewStoreORStoreValidation=0;
	public static String FinalLatLngJsonFile="LTFoodsFinalLatLngJson";




*/





	// Its for Development  Path on 194 server for SFA


/*

	public static String AppLatLngJsonFile="LTFoodsLatLngJson";
	public static File imageF_savedInstance=null;
	public static String imageName_savedInstance=null;
	public static String clickedTagPhoto_savedInstance=null;
	public static Uri uriSavedImage_savedInstance=null;

	public static String imei="";

	public static String fileContent="";
	public static final String MejiDairyPreference="MejiDairyPreference";

	public static String WebManageDSRUrl="http://103.20.212.194/LTACE_Dev/pda/frmIMEImanagement.aspx";

    public static String WebServicePath="http://103.20.212.194/WebServiceAndroidLTFoodsDevelopment/Service.asmx";

    public static int DistanceRange=500;//Defautl Distance Range to show for store list


    public static String VersionDownloadPath="http://103.20.212.194/downloads/";
	public static String VersionDownloadAPKName="LTAceSOStoreMappingDev.apk";
	//public static String VersionDownloadAPKName="LTAceSODev.apk"; // this name change according to varun sir mail on 16 jan 2018


	public static String DATABASE_NAME = "DBAdapterLtFoods";
	public static int AnyVisit = 0;

	public static int DATABASE_VERSIONID = 27;      // put this field value based on value in table on the server
	public static String AppVersionID = "1.6";   // put this field value based on value in table on the server
	public static int Application_TypeID = 3; //1=Parag Store Mapping,2=Parag SFA Indirect,3=Parag SFA Direct


	public static String OrderSyncPath="http://103.20.212.194/ReadXML_LTFoodsDevelopment/DefaultSO.aspx";
	public static String ImageSyncPath="http://103.20.212.194/ReadXML_LTFoodsImagesDevelopment/Default.aspx";

    public static String OrderTextSyncPath="http://103.20.212.194/ReadTxtFileForLTFoodsSFADevelopment/default.aspx";


	public static String InvoiceSyncPath="http://103.20.212.194/ReadXML_LTFoodsInvoiceDevelopment/Default.aspx";
	public static String DistributorSyncPath="http://103.20.212.194/ReadXML_LTFoodsSFADistributionDev/Default.aspx";

	public static String URLImageLinkToViewStoreOverWebProtal="http://103.20.212.194/ltace/Reports/frmPDAImgsDev.aspx";
	public static String SalesPersonTodaysTargetMsg="";

		public static String OrderXMLFolder="LTAceXml";
	public static String ImagesnFolder="LTAceImages";

		public static int flgLTFoodsSOOnlineOffLine=0;
	public static int flgNewStoreORStoreValidation=0;
	public static String FinalLatLngJsonFile="LTFoodsFinalLatLngJson";

*/

	// Its for Test Release  Path on 194 server for SFA


/*

	public static String AppLatLngJsonFile="LTFoodsLatLngJson";
	public static File imageF_savedInstance=null;
	public static String imageName_savedInstance=null;
	public static String clickedTagPhoto_savedInstance=null;
	public static Uri uriSavedImage_savedInstance=null;

	public static String imei="";

	public static String fileContent="";
	public static final String MejiDairyPreference="MejiDairyPreference";

	public static String WebManageDSRUrl="http://103.20.212.194/LTACE_Dev/pda/frmIMEImanagement.aspx";

	public static String WebServicePath="http://103.20.212.194/WebServiceAndroidLTFoodsTestRelease/Service.asmx";

	public static int DistanceRange=500;//Defautl Distance Range to show for store list


	public static String VersionDownloadPath="http://103.20.212.194/downloads/";
	public static String VersionDownloadAPKName="LTAceSOStoreMappingTestRelease.apk";
	//public static String VersionDownloadAPKName="LTAceSODev.apk"; // this name change according to varun sir mail on 16 jan 2018


	public static String DATABASE_NAME = "DBAdapterLtFoods";
	public static int AnyVisit = 0;

	public static int DATABASE_VERSIONID = 51;      // put this field value based on value in table on the server
	public static String AppVersionID = "1.12";   // put this field value based on value in table on the server
	public static int Application_TypeID = 3; //1=Parag Store Mapping,2=Parag SFA Indirect,3=Parag SFA Direct


	public static String OrderSyncPath="http://103.20.212.194/ReadXML_LTFoodsTestRelease/DefaultSO.aspx";
	public static String ImageSyncPath="http://103.20.212.194/ReadXML_LTFoodsImagesTestRelease/Default.aspx";

	public static String OrderTextSyncPath="http://103.20.212.194/ReadTxtFileForLTFoodsSFADevelopment/default.aspx";


	public static String InvoiceSyncPath="http://103.20.212.194/ReadXML_LTFoodsInvoiceDevelopment/Default.aspx";
	public static String DistributorSyncPath="http://103.20.212.194/ReadXML_LTFoodsSFADistributionDev/Default.aspx";

	public static String URLImageLinkToViewStoreOverWebProtal="http://103.20.212.194/ltace_TestRelease/Reports/frmPDAImgsDev.aspx";
	public static String SalesPersonTodaysTargetMsg="";

	public static String OrderXMLFolder="LTAceXml";
	public static String ImagesnFolder="LTAceImages";

	public static int flgLTFoodsSOOnlineOffLine=0;
	public static int flgNewStoreORStoreValidation=0;
	public static String FinalLatLngJsonFile="LTFoodsFinalLatLngJson";

*/

}
