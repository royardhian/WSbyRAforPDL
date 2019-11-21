package com.wsByRAforPDL.model;

import java.util.List;

public class EmpRestURIConstants {

	public static final String DATABASECOMM = "jdbc:sqlserver://192.168.1.114:1433;databaseName=COMP;user=tno.ua.sql.01;password=Oh9DUb839;";
	public static final String DATABASEPRODROP =
	// "jdbc:sqlserver://170.10.11.137:1433;databaseName=prodrop;user=beta.ebz.01;password=PK83Bcu67;";
	// //VD1-DAU-016
	//
	// "jdbc:sqlserver://192.168.1.51:1433;databaseName=prodrop;user=tno.ua.sql.01;password=Oh9DUb839;";
	// //VD1-DDB-011
	// "jdbc:sqlserver://192.168.1.61:1433;databaseName=prodrop;user=tno.ua.sql.01;password=Oh9DUb839;";
	// //VI1-DDB-011
	// "jdbc:sqlserver://192.168.1.71:1433;databaseName=prodrop;user=tno.ua.sql.01;password=Oh9DUb839;";
	// //VU1-DDB-011
	//
	// "jdbc:sqlserver://192.168.1.52:1433;databaseName=prodrop;user=tno.ua.sql.01;password=Oh9DUb839;";
	// //VD1-DDB-012
	// "jdbc:sqlserver://192.168.1.62:1433;databaseName=prodrop;user=tno.ua.sql.01;password=Oh9DUb839;";
	// //VI1-DDB-012
	// "jdbc:sqlserver://192.168.1.72:1433;databaseName=prodrop;user=tno.ua.sql.01;password=Oh9DUb839;";
	// //VU1-DDB-012
	//
	// "jdbc:sqlserver://192.168.1.53:1433;databaseName=prodrop;user=tno.ua.sql.01;password=Oh9DUb839;";
	// //VD1-DDB-013
	// "jdbc:sqlserver://192.168.1.63:1433;databaseName=prodrop;user=tno.ua.sql.01;password=Oh9DUb839;";
	// //VI1-DDB-013
	// "jdbc:sqlserver://192.168.1.73:1433;databaseName=prodrop;user=tno.ua.sql.01;password=Oh9DUb839;";
	// //VU1-DDB-013
	//
	// "jdbc:sqlserver://192.168.1.54:1433;databaseName=prodrop;user=tno.ua.sql.01;password=Oh9DUb839;";
	// //VD1-DDB-014
	// "jdbc:sqlserver://192.168.1.64:1433;databaseName=prodrop;user=tno.ua.sql.01;password=Oh9DUb839;";
	// //VI1-DDB-014
	// "jdbc:sqlserver://192.168.1.214:1433;databaseName=prodrop;user=tno.ua.sql.01;password=Oh9DUb839;";
	// //VU1-DDB-014
	//
	// "jdbc:sqlserver://192.168.1.55:1433;databaseName=prodrop;user=tno.ua.sql.01;password=Oh9DUb839;";
	// //VD1-DDB-015
	// "jdbc:sqlserver://192.168.1.65:1433;databaseName=prodrop;user=tno.ua.sql.01;password=Oh9DUb839;";
	// //VI1-DDB-015
	// "jdbc:sqlserver://192.168.1.215:1433;databaseName=prodrop;user=tno.ua.sql.01;password=Oh9DUb839;";
	// //VU1-DDB-015
	//
	// "jdbc:sqlserver://192.168.1.56:1433;databaseName=prodrop;user=tno.ua.sql.01;password=Oh9DUb839;";
	// //VD1-DDB-016
	// "jddbc:sqlserver://192.168.1.66:1433;databaseName=prodrop;user=tno.ua.sql.01;password=Oh9DUb839;";
	// //VI1-DDB-016
	// "jdbc:sqlserver://192.168.1.216:1433;databaseName=prodrop;user=tno.ua.sql.01;password=Oh9DUb839;";
	// //VU1-DDB-016
	//
	// "jdbc:sqlserver://192.168.1.57:1433;databaseName=prodrop;user=tno.ua.sql.01;password=Oh9DUb839;";
	// //VD1-DDB-017
	// "jdbc:sqlserver://192.168.1.67:1433;databaseName=prodrop;user=tno.ua.sql.01;password=Oh9DUb839;";
	// //VI1-DDB-017
	// "jdbc:sqlserver://192.168.1.217:1433;databaseName=prodrop;user=tno.ua.sql.01;password=Oh9DUb839;";
	// //VU1-DDB-017
	//
	// "jdbc:sqlserver://192.168.1.58:1433;databaseName=prodrop;user=tno.ua.sql.01;password=Oh9DUb839;";
	// //VD1-DDB-018
	// "jdbc:sqlserver://192.168.1.68:1433;databaseName=prodrop;user=tno.ua.sql.01;password=Oh9DUb839;";
	// //VI1-DDB-018
	// "jdbc:sqlserver://192.168.1.218:1433;databaseName=prodrop;user=tno.ua.sql.01;password=Oh9DUb839;";
	// //VU1-DDB-018
	//
	// "jdbc:sqlserver://192.168.1.59:1433;databaseName=prodrop;user=tno.ua.sql.01;password=Oh9DUb839;";
	// //VD1-DDB-019
	// "jdbc:sqlserver://192.168.1.69:1433;databaseName=prodrop;user=tno.ua.sql.01;password=Oh9DUb839;";
	// //VI1-DDB-019
	// "jdbc:sqlserver://192.168.1.219:1433;databaseName=prodrop;user=tno.ua.sql.01;password=Oh9DUb839;";
	// //VU1-DDB-019

	"jdbc:sqlserver://192.168.1.60:1433;databaseName=prodrop;user=tno.ua.sql.01;password=Oh9DUb839;"; // VD1-DDB-020
	// "jdbc:sqlserver://192.168.1.70:1433;databaseName=prodrop;user=tno.ua.sql.01;password=Oh9DUb839;";
	// //VI1-DDB-020
	// "jdbc:sqlserver://192.168.1.220:1433;databaseName=prodrop;user=tno.ua.sql.01;password=Oh9DUb839;";
	// //VU1-DDB-020

	public static final String[] DATABASE = { DATABASEPRODROP, DATABASECOMM };

	public static final String[] DB = {
			"jdbc:sqlserver://170.10.11.137:1433;databaseName=prodrop;user=beta.ebz.01;password=PK83Bcu67;", // VD1-DAU-016

			"jdbc:sqlserver://192.168.1.51:1433;databaseName=prodrop;user=tno.ua.sql.01;password=Oh9DUb839;", // VD1-DDB-011
			"jdbc:sqlserver://192.168.1.61:1433;databaseName=prodrop;user=tno.ua.sql.01;password=Oh9DUb839;", // VI1-DDB-011
			"jdbc:sqlserver://192.168.1.71:1433;databaseName=prodrop;user=tno.ua.sql.01;password=Oh9DUb839;", // VU1-DDB-011

			"jdbc:sqlserver://192.168.1.52:1433;databaseName=prodrop;user=tno.ua.sql.01;password=Oh9DUb839;", // VD1-DDB-012
			"jdbc:sqlserver://192.168.1.62:1433;databaseName=prodrop;user=tno.ua.sql.01;password=Oh9DUb839;", // VI1-DDB-012
			"jdbc:sqlserver://192.168.1.72:1433;databaseName=prodrop;user=tno.ua.sql.01;password=Oh9DUb839;", // VU1-DDB-012

			"jdbc:sqlserver://192.168.1.53:1433;databaseName=prodrop;user=tno.ua.sql.01;password=Oh9DUb839;", // VD1-DDB-013
			"jdbc:sqlserver://192.168.1.63:1433;databaseName=prodrop;user=tno.ua.sql.01;password=Oh9DUb839;", // VI1-DDB-013
			"jdbc:sqlserver://192.168.1.73:1433;databaseName=prodrop;user=tno.ua.sql.01;password=Oh9DUb839;", // VU1-DDB-013

			"jdbc:sqlserver://192.168.1.54:1433;databaseName=prodrop;user=tno.ua.sql.01;password=Oh9DUb839;", // VD1-DDB-014
			"jdbc:sqlserver://192.168.1.64:1433;databaseName=prodrop;user=tno.ua.sql.01;password=Oh9DUb839;", // VI1-DDB-014
			"jdbc:sqlserver://192.168.1.214:1433;databaseName=prodrop;user=tno.ua.sql.01;password=Oh9DUb839;", // VU1-DDB-014

			"jdbc:sqlserver://192.168.1.55:1433;databaseName=prodrop;user=tno.ua.sql.01;password=Oh9DUb839;", // VD1-DDB-015
			"jdbc:sqlserver://192.168.1.65:1433;databaseName=prodrop;user=tno.ua.sql.01;password=Oh9DUb839;", // VI1-DDB-015
			"jdbc:sqlserver://192.168.1.215:1433;databaseName=prodrop;user=tno.ua.sql.01;password=Oh9DUb839;", // VU1-DDB-015

			"jdbc:sqlserver://192.168.1.56:1433;databaseName=prodrop;user=tno.ua.sql.01;password=Oh9DUb839;", // VD1-DDB-016
			"jddbc:sqlserver://192.168.1.66:1433;databaseName=prodrop;user=tno.ua.sql.01;password=Oh9DUb839;", // VI1-DDB-016
			"jdbc:sqlserver://192.168.1.216:1433;databaseName=prodrop;user=tno.ua.sql.01;password=Oh9DUb839;", // VU1-DDB-016

			"jdbc:sqlserver://192.168.1.57:1433;databaseName=prodrop;user=tno.ua.sql.01;password=Oh9DUb839;", // VD1-DDB-017
			"jdbc:sqlserver://192.168.1.67:1433;databaseName=prodrop;user=tno.ua.sql.01;password=Oh9DUb839;", // VI1-DDB-017
			"jdbc:sqlserver://192.168.1.217:1433;databaseName=prodrop;user=tno.ua.sql.01;password=Oh9DUb839;", // VU1-DDB-017

			"jdbc:sqlserver://192.168.1.58:1433;databaseName=prodrop;user=tno.ua.sql.01;password=Oh9DUb839;", // VD1-DDB-018
			"jdbc:sqlserver://192.168.1.68:1433;databaseName=prodrop;user=tno.ua.sql.01;password=Oh9DUb839;", // VI1-DDB-018
			"jdbc:sqlserver://192.168.1.218:1433;databaseName=prodrop;user=tno.ua.sql.01;password=Oh9DUb839;", // VU1-DDB-018

			"jdbc:sqlserver://192.168.1.59:1433;databaseName=prodrop;user=tno.ua.sql.01;password=Oh9DUb839;", // VD1-DDB-019
			"jdbc:sqlserver://192.168.1.69:1433;databaseName=prodrop;user=tno.ua.sql.01;password=Oh9DUb839;", // VI1-DDB-019
			"jdbc:sqlserver://192.168.1.219:1433;databaseName=prodrop;user=tno.ua.sql.01;password=Oh9DUb839;", // VU1-DDB-019

			"jdbc:sqlserver://192.168.1.60:1433;databaseName=prodrop;user=tno.ua.sql.01;password=Oh9DUb839;", // VD1-DDB-020
			"jdbc:sqlserver://192.168.1.70:1433;databaseName=prodrop;user=tno.ua.sql.01;password=Oh9DUb839;", // VI1-DDB-020
			"jdbc:sqlserver://192.168.1.220:1433;databaseName=prodrop;user=tno.ua.sql.01;password=Oh9DUb839;" // VU1-DDB-020
	};

	public static final String[] DBNAME = { "VD1-DAU-016", "VD1-DDB-011", "VI1-DDB-011", "VU1-DDB-011", "VD1-DDB-012",
			"VI1-DDB-012", "VU1-DDB-012", "VD1-DDB-013", "VI1-DDB-013", "VU1-DDB-013", "VD1-DDB-014", "VI1-DDB-014",
			"VU1-DDB-014", "VD1-DDB-015", "VI1-DDB-015", "VU1-DDB-015", "VD1-DDB-016", "VI1-DDB-016", "VU1-DDB-016",
			"VD1-DDB-017", "VI1-DDB-017", "VU1-DDB-017", "VD1-DDB-018", "VI1-DDB-018", "VU1-DDB-018", "VD1-DDB-019",
			"VI1-DDB-019", "VU1-DDB-019", "VD1-DDB-020", "VI1-DDB-020", "VU1-DDB-020" };

}
