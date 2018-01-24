package com.test.main;

import com.test.cases.ALOO;
import com.test.cases.CY1668;
import com.test.cases.Moto;
import com.test.cases.RYJumpLead;
import com.test.cases.WeChart;

public class CasesManifest {
	public static boolean flags=false;
	public static void initCase(){
		TestPort.putCases(RYJumpLead.class);
		TestPort.putCases(CY1668.class);
		TestPort.putCases(Moto.class);
		TestPort.putCases(ALOO.class);
		TestPort.putCases(WeChart.class);
	}
	
}
