package com.alejandropadron.taller.entrypoint;

public class StringMain {

	public StringMain() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		StringBuffer str = new StringBuffer();
		str.append("SELECT PERSO.AUSWEIS as a1, PERSO.AUSWPROJ as b2, PERSO.N_NAME as c3 ,PERS_NR as d4, ZK.ZBVLE15 as e5 ");
		str.append("FROM AZS.dbo.PERSOB PERSO ");
		str.append("JOIN AZS.dbo.PERS_ZK ZK on PERSO.AUSWIDT = ZK.AUSWIDT ");
		str.append("WHERE (( (LEN(PERSO.AUSWEIS) = %d) AND PERSO.status = 0 ) OR LEN(PERSO.AUSWEIS) = %d) ");
		str.append("AND PERSO.AUSWIDT IN ( SELECT AUSWIDT FROM AZS.dbo.P_ZON_NR WHERE ZONE_NR IN (:zona))  ");
		str.append("AND dateadd(d, 0, PERSO.guelt_von) <= DateAdd(d, 0, getdate())  ");
		str.append("AND dateadd(d, 0, PERSO.guelt_bis) >= DateAdd(d, 0, getdate())  ");
		System.out.println(str.toString());
		String f = String.format(str.toString(), 5, 16);
		System.out.println(str.toString());
		System.out.println(f);

	}

}
