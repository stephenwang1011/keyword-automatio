package com.incito.keywordauto.testcase.goods; 
import org.testng.annotations.Test; 
import com.incito.keywordauto.base.BaseParpare; 
 import com.incito.keywordauto.util.SeleniumKeyWordAction; 
public class GoodsG001 extends BaseParpare{ 
@Test 
 public void G001() { 
SeleniumKeyWordAction.readExcel("Goods","G001",seleniumUtil);
 }
}