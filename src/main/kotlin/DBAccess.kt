import com.google.gson.Gson
import data.RealStockInfo
import kotlinx.coroutines.experimental.runBlocking


fun main(args: Array<String>) = runBlocking {
    println("Helo world")
    val bean = Gson().fromJson("{\n" +
            "  \"showapi_res_code\": 0,\n" +
            "  \"showapi_res_error\": \"\",\n" +
            "  \"showapi_res_body\": {\n" +
            "    \"ret_code\": 0,\n" +
            "    \"list\": [\n" +
            "      {\n" +
            "        \"todayMax\": \"16.160\",//今日最高价\n" +
            "        \"highLimit\": \"17.57\",//涨停价\n" +
            "        \"buy5_n\": \"18100\",//买五\n" +
            "        \"buy2_n\": \"56600\",//买二\n" +
            "        \"tradeNum\": \"3336273\",//成交量(股，不是手)\n" +
            "        \"buy2_m\": \"16.080\",//买二报价\n" +
            "        \"buy5_m\": \"16.050\",//买五报价\n" +
            "        \"currcapital\": \"115641.6852\",\n" +
            "        \"sell3_m\": \"16.120\",//卖三报价\n" +
            "        \"openPrice\": \"15.950\",//今日开盘价\n" +
            "        \"buy3_m\": \"16.070\",//买三报价\n" +
            "        \"buy4_m\": \"16.060\",//买四报价\n" +
            "        \"circulation_value\": \"186.18\",//流通市值，亿元\n" +
            "        \"buy4_n\": \"25000\",//买四\n" +
            "        \"date\": \"2017-04-18\",//日期\n" +
            "        \"sell5_n\": \"19300\",//卖五\n" +
            "        \"buy3_n\": \"35800\",//买三\n" +
            "        \"all_value\": \"186.18\",//总市值，亿元\n" +
            "        \"sell5_m\": \"16.140\",//卖五报价\n" +
            "        \"time\": \"11:11:43\",//刷新时间\n" +
            "        \"turnover\": \"0.289%\",//换手率\n" +
            "        \"sell3_n\": \"12900\",//卖三\n" +
            "        \"name\": \"白云机场\",//上证指数\n" +
            "        \"sell4_n\": \"9600\",//卖四\n" +
            "        \"downLimit\": \"14.37\",//跌停价\n" +
            "        \"sell4_m\": \"16.130\",//卖四报价\n" +
            "        \"tradeAmount\": \"53647432.000\",//成交金额（元）\n" +
            "        \"swing\": \"1.31\",//振幅\n" +
            "        \"totalcapital\": \"115641.6852\", //总股本，万股\n" +
            "        \"diff_rate\": \"0.81\",//涨跌幅度\n" +
            "        \"yestodayClosePrice\": \"15.970\",//昨日收盘价\n" +
            "        \"sell1_n\": \"67963\",//卖一\n" +
            "        \"todayMin\": \"15.950\",//今日最低价\n" +
            "        \"sell1_m\": \"16.100\",//卖一报价\n" +
            "        \"max52\": \"\",//52周最高价\n" +
            "        \"diff_money\": \"0.13\",//涨跌金额\n" +
            "        \"code\": \"600004\",//sh000001\n" +
            "        \"nowPrice\": \"16.100\",//当前价\n" +
            "        \"sell2_m\": \"16.110\",//卖二\n" +
            "        \"min52\": \"\",//52周最低价\n" +
            "        \"sell2_n\": \"20879\",//卖二\n" +
            "        \"buy1_m\": \"16.090\",//买一报价（金额，元）\n" +
            "        \"pe\": \"13.64\",//市盈率(TTM,动态)\n" +
            "        \"buy1_n\": \"53900\",//买一数量（股）\n" +
            "        \"market\": \"sh\",\n" +
            "        \"pb\": \"1.74\"//市净率\n" +
            "      }\n" +
            "    ],\n" +
            "     \"indexList\": [\n" +
            "      {\n" +
            "        \"yestodayClosePrice\": \"3222.1673\",//昨日收盘点数\n" +
            "        \"max52\": \"0\",//52周最大点数\n" +
            "        \"diff_money\": \"-3.2288\",//涨跌点数\n" +
            "        \"tradeNum\": \"89917531\",//成交量(手)\n" +
            "        \"code\": \"sh000001\",\n" +
            "        \"maxPrice\": \"3225.0546\",//今日最高点数\n" +
            "        \"nowPrice\": \"3218.9385\",//当前点数\n" +
            "        \"min52\": \"0\",//52周最低点数\n" +
            "        \"time\": \"2017-04-18 11:11:42\",//时间\n" +
            "        \"name\": \"上证指数\",//股票名称\n" +
            "        \"tradeAmount\": \"102068196850\",//成交金额（金额，元）\n" +
            "        \"swing\": \"0.3923\",//振幅 %\n" +
            "        \"todayOpenPrice\": \"3215.3963\", //今日开盘点数\n" +
            "        \"diff_rate\": \"-0.1002\",//涨跌幅度%\n" +
            "        \"minPrice\": \"3212.4147\" //今日最低点数\n" +
            "      },\n" +
            "      {\n" +
            "        \"yestodayClosePrice\": \"10450.862\",\n" +
            "        \"max52\": \"0\",\n" +
            "        \"diff_money\": \"52.0050\",\n" +
            "        \"tradeNum\": \"8936187496\",\n" +
            "        \"code\": \"sz399001\",\n" +
            "        \"maxPrice\": \"10522.852\",\n" +
            "        \"nowPrice\": \"10502.867\",\n" +
            "        \"min52\": \"0\",\n" +
            "        \"time\": \"2017-04-18 11:11:48\",\n" +
            "        \"name\": \"深证成指\",\n" +
            "        \"tradeAmount\": \"128120230756.756\",\n" +
            "        \"swing\": \"0.7086\",\n" +
            "        \"todayOpenPrice\": \"10449.008\",\n" +
            "        \"diff_rate\": \"0.4976\",\n" +
            "        \"minPrice\": \"10448.799\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"yestodayClosePrice\": \"6756.199\",\n" +
            "        \"max52\": \"0\",\n" +
            "        \"diff_money\": \"28.7090\",\n" +
            "        \"tradeNum\": \"704151391\",\n" +
            "        \"code\": \"sz399005\",\n" +
            "        \"maxPrice\": \"6794.898\",\n" +
            "        \"nowPrice\": \"6784.908\",\n" +
            "        \"min52\": \"0\",\n" +
            "        \"time\": \"2017-04-18 11:11:48\",\n" +
            "        \"name\": \"中小板指\",\n" +
            "        \"tradeAmount\": \"13042317160.670\",\n" +
            "        \"swing\": \"0.5949\",\n" +
            "        \"todayOpenPrice\": \"6757.345\",\n" +
            "        \"diff_rate\": \"0.4249\",\n" +
            "        \"minPrice\": \"6754.704\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"yestodayClosePrice\": \"1868.281\",\n" +
            "        \"max52\": \"0\",\n" +
            "        \"diff_money\": \"5.5260\",\n" +
            "        \"tradeNum\": \"387746143\",\n" +
            "        \"code\": \"sz399006\",\n" +
            "        \"maxPrice\": \"1878.097\",\n" +
            "        \"nowPrice\": \"1873.807\",\n" +
            "        \"min52\": \"0\",\n" +
            "        \"time\": \"2017-04-18 11:11:48\",\n" +
            "        \"name\": \"创业板指\",\n" +
            "        \"tradeAmount\": \"7347006509.620\",\n" +
            "        \"swing\": \"0.5632\",\n" +
            "        \"todayOpenPrice\": \"1867.575\",\n" +
            "        \"diff_rate\": \"0.2958\",\n" +
            "        \"minPrice\": \"1867.575\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"yestodayClosePrice\": \"24261.660\",\n" +
            "        \"max52\": \"24656.650\",\n" +
            "        \"diff_money\": \"-231.750\",\n" +
            "        \"tradeNum\": \"0\",\n" +
            "        \"code\": \"HSI\",\n" +
            "        \"maxPrice\": \"24276.311\",\n" +
            "        \"nowPrice\": \"24029.910\",\n" +
            "        \"min52\": \"19594.609\",\n" +
            "        \"time\": \"2017-04-18 11:11:48\",\n" +
            "        \"name\": \"恒生指数\",\n" +
            "        \"tradeAmount\": \"29530142.152\",\n" +
            "        \"swing\": \"1.1330\",\n" +
            "        \"todayOpenPrice\": \"24268.170\",\n" +
            "        \"diff_rate\": \"-0.960\",\n" +
            "        \"minPrice\": \"24001.430\"\n" +
            "      }\n" +
            "    ]\n" +
            "  }\n" +
            "}", RealStockInfo::class.java)

//    println(bean.showapi_res_body?.list?.get(0)?.all_value)

    fun filterSpace(s: String): String {
        return s.trim().filterNot { it == ' ' }
    }

    fun getByteLength(s: String): Int {
        return s.length / 2
    }

    val length1 = "60 00 03 00 00 60 31 00 31 54 32 08 00 00 20 00 00 00 C0 00 16 00 00 21 31 32 33 34 35 36 37 36 31 32 33 34 35 36 37 38 39 30 31 32 33 34 35 00 11 00 00 00 01 00 30 00 29 53 65 71 75 65 6E 63 65 20 4E 6F 31 36 33 30 38 31 30 33 38 35 4E 4C 32 34 37 35 33 36 00 03 30 31 20"
    val length2 = "02 01 70 60 00 03 00 00 60 31 00 31 54 32 02 00 30 20 04 C0 30 C0 98 11 00 00 00 00 00 00 00 01 28 00 00 22 02 10 00 12 37 62 21 50 55 00 00 00 01 04 5D 49 12 12 02 86 06 00 00 00 01 04 99 62 21 50 55 00 00 00 01 04 5D 15 61 56 00 00 00 00 00 00 00 03 00 00 00 11 40 00 04 91 21 D0 00 00 00 00 00 0D 00 00 00 00 00 00 D0 00 00 00 28 60 60 00 31 32 33 34 35 36 37 36 31 32 33 34 35 36 37 38 39 30 31 32 33 34 35 31 35 36 BF 80 FC 2F F8 B4 D6 15 26 00 00 00 00 00 00 00 00 14 22 00 00 01 00 05 01 XX XX XX XX XX XX XX XX 03 34 "
    val length3 = "31 32 33 34 35 36 37 38 39 30 31 32 33 34 35 "

    println(getByteLength(filterSpace(length1)))
    println(getByteLength(filterSpace(length2)))
//    println(filterSpace(length1).length - filterSpace(length2).length)
    println("Length3 is ${getByteLength(filterSpace(length3))}")

}
