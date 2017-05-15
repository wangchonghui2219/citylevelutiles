# citylevelutiles

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}Copy
Step 2. Add the dependency

	dependencies {
	        compile 'com.github.wangchonghui2219:citylevelutiles:1.0'
	}
  
    //显示窗体
   AddressPopuWindow.showWindow(ctx,banner);
   //
    AddressPopuWindow.setData(new SeleteAddressInter{
         public  void setAddressSeleteData(String data){
         //获得显示的数据
         }
    });
  
