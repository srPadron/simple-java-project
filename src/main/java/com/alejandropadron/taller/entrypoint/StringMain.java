package com.alejandropadron.taller.entrypoint;

public class StringMain {

    public static void main(final String[] args) {
	// Main5(null, null);
	// Main5((short) 1, null);
	// Main5(null, (short) 1);
	// Main5((short) 1, (short) 1);
	main6();
    }

    public static void Main() {
	String str = f1();
	System.out.println(str.toString());
	String f = String.format(str.toString(), 5, 16);
	System.out.println(str.toString());
	System.out.println(f);
    }

    public static String f1() {
	StringBuffer str = new StringBuffer();
	str.append("SELECT PERSO.AUSWEIS as a1, PERSO.AUSWPROJ as b2, PERSO.N_NAME as c3 ,PERS_NR as d4, ZK.ZBVLE15 as e5 ");
	str.append("FROM AZS.dbo.PERSOB PERSO ");
	str.append("JOIN AZS.dbo.PERS_ZK ZK on PERSO.AUSWIDT = ZK.AUSWIDT ");
	str.append("WHERE (( (LEN(PERSO.AUSWEIS) = %d) AND PERSO.status = 0 ) OR LEN(PERSO.AUSWEIS) = %d) ");
	str.append("AND PERSO.AUSWIDT IN ( SELECT AUSWIDT FROM AZS.dbo.P_ZON_NR WHERE ZONE_NR IN (:zona))  ");
	str.append("AND dateadd(d, 0, PERSO.guelt_von) <= DateAdd(d, 0, getdate())  ");
	str.append("AND dateadd(d, 0, PERSO.guelt_bis) >= DateAdd(d, 0, getdate())  ");
	return str.toString();
    }

    public static void Main2() {
	String textoLibre = "330";
	String idPais = "23";
	String idCadena = "1";

	String sql_obra_predict_text_R = "(D.POBLACION LIKE '%textoLibre%' OR O.ID_OBRA LIKE 'textoLibre%' OR O.DESCRIPCION LIKE '%textoLibre%' OR T.ID_TIENDA LIKE 'textoLibre%' OR T.NOMBRE_TIENDA LIKE 'textoLibre%');O.ID_PAIS = :idPais;O.ID_cadena = :idCadena";
	String[] split = sql_obra_predict_text_R.split(";");
	StringBuilder strB = new StringBuilder();
	System.out.println("--" + strB.toString() + "--");
	if (textoLibre != null && !textoLibre.isEmpty()) {
	    strB.append(" AND ").append(split[0].replaceAll("textoLibre", textoLibre));
	}
	if (idPais != null && !idPais.isEmpty()) {
	    strB.append(" AND ").append(split[1]);
	}
	if (idCadena != null && !idCadena.isEmpty()) {
	    strB.append(" AND ").append(split[2]);
	}
	System.out.println(strB.toString());

    }

    public static void Main3() {
	// ?query={%22idZonaQr%22:1,%22uidQr%22:%22ABCDEFG%22}
	// ?query=%7B%22idZonaQr%22%3A1%2C%22uidQr%22%3A%22ABCDEFG%22%7D"
	short plataforma = 20;
	String QR = "PAPAPAPAP";
	String getUrlAndqueryParams = String.format("?query={%%22idZonaQr%%22:%d,%%22uidQr%%22:%%22%s%%22}",
		plataforma, QR);
	System.out.println(getUrlAndqueryParams);
    }

    public static void Main4() {
	String sql = "SELECT DISTINCT ID_USUARIO FROM OBRAS.SUBSCRIPCION_COMUNICACION SC ";
	// + " AND SC.ID_PAIS = :idPais"
	// +
	// " AND SC.ID_SUBTIPO_NOTIFICACION_CORREO = :idSubtipoNotificacionCorreo"
	// + " AND SC.ID_CADENA = :idCadena"
	// + " AND SC.PARA = :para "
	// + " AND SC.COPIA = :copia "
	// + " AND SC.COPIA_OCULTA = :copiaOculta"
	// + " AND (SC.ID_GRUPO IS NULL OR SC.ID_GRUPO = :idGrupo)";
	sql = sql.replaceFirst(" AND ", " WHERE ");

	System.out.println(sql);
    }

    public static void Main5(final Short idGrupoComunicacion, final Short idGrupo) {
	String sql = "SELECT SC.ID_SUBGRUPO_COMUNICACION, SC.ID_GRUPO_COMUNICACION, SC.ID_USUARIO, SC.ID_TIPO_CONTACTO, SC.ID_GRUPO "
		+ "FROM OBRAS.SUBGRUPO_COMUNICACION SC "
		+ "JOIN OBRAS.GRUPO_COMUNICACION GC ON GC.ID_GRUPO_COMUNICACION = SC.ID_GRUPO_COMUNICACION "
		+ "JOIN OBRAS.GRUPO G ON G.ID_GRUPO = SC.ID_GRUPO ";

	String restricciones = "";

	if (idGrupoComunicacion != null) {
	    restricciones = restricciones.concat(" AND SC.ID_GRUPO_COMUNICACION =:idGrupoComunicacion");
	}
	if (idGrupo != null) {
	    restricciones = restricciones.concat(" AND SC.ID_GRUPO = :idGrupo");
	}

	if (restricciones.length() > 0) {
	    restricciones = restricciones.replaceFirst(" AND ", " WHERE ");
	    sql = sql.concat(restricciones);
	}

	System.out.println(sql);

    }

    public static void main6() {
	String s1 = "Orders creation";
	String s2 = "Creaci\u00F3n de pedidos";
	s1 = s1.replaceFirst("s\\s*", " ").concat(" PED/1234");
	s2 = s2.replaceFirst("s\\s*", " ").concat(" PED/1234");
	System.out.println(s1);
	System.out.println(s2);

    }
}
