package data

class RealStockInfo {

    /**
     * showapi_res_code : 0
     * showapi_res_error :
     * showapi_res_body : {"ret_code":0,"list":[{"todayMax":"16.160","highLimit":"17.57","buy5_n":"18100","buy2_n":"56600","tradeNum":"3336273","buy2_m":"16.080","buy5_m":"16.050","currcapital":"115641.6852","sell3_m":"16.120","openPrice":"15.950","buy3_m":"16.070","buy4_m":"16.060","circulation_value":"186.18","buy4_n":"25000","date":"2017-04-18","sell5_n":"19300","buy3_n":"35800","all_value":"186.18","sell5_m":"16.140","time":"11:11:43","turnover":"0.289%","sell3_n":"12900","name":"白云机场","sell4_n":"9600","downLimit":"14.37","sell4_m":"16.130","tradeAmount":"53647432.000","swing":"1.31","totalcapital":"115641.6852","diff_rate":"0.81","yestodayClosePrice":"15.970","sell1_n":"67963","todayMin":"15.950","sell1_m":"16.100","max52":"","diff_money":"0.13","code":"600004","nowPrice":"16.100","sell2_m":"16.110","min52":"","sell2_n":"20879","buy1_m":"16.090","pe":"13.64","buy1_n":"53900","market":"sh","pb":"1.74"}],"indexList":[{"yestodayClosePrice":"3222.1673","max52":"0","diff_money":"-3.2288","tradeNum":"89917531","code":"sh000001","maxPrice":"3225.0546","nowPrice":"3218.9385","min52":"0","time":"2017-04-18 11:11:42","name":"上证指数","tradeAmount":"102068196850","swing":"0.3923","todayOpenPrice":"3215.3963","diff_rate":"-0.1002","minPrice":"3212.4147"},{"yestodayClosePrice":"10450.862","max52":"0","diff_money":"52.0050","tradeNum":"8936187496","code":"sz399001","maxPrice":"10522.852","nowPrice":"10502.867","min52":"0","time":"2017-04-18 11:11:48","name":"深证成指","tradeAmount":"128120230756.756","swing":"0.7086","todayOpenPrice":"10449.008","diff_rate":"0.4976","minPrice":"10448.799"},{"yestodayClosePrice":"6756.199","max52":"0","diff_money":"28.7090","tradeNum":"704151391","code":"sz399005","maxPrice":"6794.898","nowPrice":"6784.908","min52":"0","time":"2017-04-18 11:11:48","name":"中小板指","tradeAmount":"13042317160.670","swing":"0.5949","todayOpenPrice":"6757.345","diff_rate":"0.4249","minPrice":"6754.704"},{"yestodayClosePrice":"1868.281","max52":"0","diff_money":"5.5260","tradeNum":"387746143","code":"sz399006","maxPrice":"1878.097","nowPrice":"1873.807","min52":"0","time":"2017-04-18 11:11:48","name":"创业板指","tradeAmount":"7347006509.620","swing":"0.5632","todayOpenPrice":"1867.575","diff_rate":"0.2958","minPrice":"1867.575"},{"yestodayClosePrice":"24261.660","max52":"24656.650","diff_money":"-231.750","tradeNum":"0","code":"HSI","maxPrice":"24276.311","nowPrice":"24029.910","min52":"19594.609","time":"2017-04-18 11:11:48","name":"恒生指数","tradeAmount":"29530142.152","swing":"1.1330","todayOpenPrice":"24268.170","diff_rate":"-0.960","minPrice":"24001.430"}]}
     */

    var showapi_res_code: Int = 0
    var showapi_res_error: String? = null
    var showapi_res_body: ShowapiResBodyBean? = null

    class ShowapiResBodyBean {
        /**
         * ret_code : 0
         * list : [{"todayMax":"16.160","highLimit":"17.57","buy5_n":"18100","buy2_n":"56600","tradeNum":"3336273","buy2_m":"16.080","buy5_m":"16.050","currcapital":"115641.6852","sell3_m":"16.120","openPrice":"15.950","buy3_m":"16.070","buy4_m":"16.060","circulation_value":"186.18","buy4_n":"25000","date":"2017-04-18","sell5_n":"19300","buy3_n":"35800","all_value":"186.18","sell5_m":"16.140","time":"11:11:43","turnover":"0.289%","sell3_n":"12900","name":"白云机场","sell4_n":"9600","downLimit":"14.37","sell4_m":"16.130","tradeAmount":"53647432.000","swing":"1.31","totalcapital":"115641.6852","diff_rate":"0.81","yestodayClosePrice":"15.970","sell1_n":"67963","todayMin":"15.950","sell1_m":"16.100","max52":"","diff_money":"0.13","code":"600004","nowPrice":"16.100","sell2_m":"16.110","min52":"","sell2_n":"20879","buy1_m":"16.090","pe":"13.64","buy1_n":"53900","market":"sh","pb":"1.74"}]
         * indexList : [{"yestodayClosePrice":"3222.1673","max52":"0","diff_money":"-3.2288","tradeNum":"89917531","code":"sh000001","maxPrice":"3225.0546","nowPrice":"3218.9385","min52":"0","time":"2017-04-18 11:11:42","name":"上证指数","tradeAmount":"102068196850","swing":"0.3923","todayOpenPrice":"3215.3963","diff_rate":"-0.1002","minPrice":"3212.4147"},{"yestodayClosePrice":"10450.862","max52":"0","diff_money":"52.0050","tradeNum":"8936187496","code":"sz399001","maxPrice":"10522.852","nowPrice":"10502.867","min52":"0","time":"2017-04-18 11:11:48","name":"深证成指","tradeAmount":"128120230756.756","swing":"0.7086","todayOpenPrice":"10449.008","diff_rate":"0.4976","minPrice":"10448.799"},{"yestodayClosePrice":"6756.199","max52":"0","diff_money":"28.7090","tradeNum":"704151391","code":"sz399005","maxPrice":"6794.898","nowPrice":"6784.908","min52":"0","time":"2017-04-18 11:11:48","name":"中小板指","tradeAmount":"13042317160.670","swing":"0.5949","todayOpenPrice":"6757.345","diff_rate":"0.4249","minPrice":"6754.704"},{"yestodayClosePrice":"1868.281","max52":"0","diff_money":"5.5260","tradeNum":"387746143","code":"sz399006","maxPrice":"1878.097","nowPrice":"1873.807","min52":"0","time":"2017-04-18 11:11:48","name":"创业板指","tradeAmount":"7347006509.620","swing":"0.5632","todayOpenPrice":"1867.575","diff_rate":"0.2958","minPrice":"1867.575"},{"yestodayClosePrice":"24261.660","max52":"24656.650","diff_money":"-231.750","tradeNum":"0","code":"HSI","maxPrice":"24276.311","nowPrice":"24029.910","min52":"19594.609","time":"2017-04-18 11:11:48","name":"恒生指数","tradeAmount":"29530142.152","swing":"1.1330","todayOpenPrice":"24268.170","diff_rate":"-0.960","minPrice":"24001.430"}]
         */

        var ret_code: Int = 0
        var list: List<ListBean>? = null
        var indexList: List<IndexListBean>? = null

        class ListBean {
            /**
             * todayMax : 16.160
             * highLimit : 17.57
             * buy5_n : 18100
             * buy2_n : 56600
             * tradeNum : 3336273
             * buy2_m : 16.080
             * buy5_m : 16.050
             * currcapital : 115641.6852
             * sell3_m : 16.120
             * openPrice : 15.950
             * buy3_m : 16.070
             * buy4_m : 16.060
             * circulation_value : 186.18
             * buy4_n : 25000
             * date : 2017-04-18
             * sell5_n : 19300
             * buy3_n : 35800
             * all_value : 186.18
             * sell5_m : 16.140
             * time : 11:11:43
             * turnover : 0.289%
             * sell3_n : 12900
             * name : 白云机场
             * sell4_n : 9600
             * downLimit : 14.37
             * sell4_m : 16.130
             * tradeAmount : 53647432.000
             * swing : 1.31
             * totalcapital : 115641.6852
             * diff_rate : 0.81
             * yestodayClosePrice : 15.970
             * sell1_n : 67963
             * todayMin : 15.950
             * sell1_m : 16.100
             * max52 :
             * diff_money : 0.13
             * code : 600004
             * nowPrice : 16.100
             * sell2_m : 16.110
             * min52 :
             * sell2_n : 20879
             * buy1_m : 16.090
             * pe : 13.64
             * buy1_n : 53900
             * market : sh
             * pb : 1.74
             */

            var todayMax: String? = null
            var highLimit: String? = null
            var buy5_n: String? = null
            var buy2_n: String? = null
            var tradeNum: String? = null
            var buy2_m: String? = null
            var buy5_m: String? = null
            var currcapital: String? = null
            var sell3_m: String? = null
            var openPrice: String? = null
            var buy3_m: String? = null
            var buy4_m: String? = null
            var circulation_value: String? = null
            var buy4_n: String? = null
            var date: String? = null
            var sell5_n: String? = null
            var buy3_n: String? = null
            var all_value: String? = null
            var sell5_m: String? = null
            var time: String? = null
            var turnover: String? = null
            var sell3_n: String? = null
            var name: String? = null
            var sell4_n: String? = null
            var downLimit: String? = null
            var sell4_m: String? = null
            var tradeAmount: String? = null
            var swing: String? = null
            var totalcapital: String? = null
            var diff_rate: String? = null
            var yestodayClosePrice: String? = null
            var sell1_n: String? = null
            var todayMin: String? = null
            var sell1_m: String? = null
            var max52: String? = null
            var diff_money: String? = null
            var code: String? = null
            var nowPrice: String? = null
            var sell2_m: String? = null
            var min52: String? = null
            var sell2_n: String? = null
            var buy1_m: String? = null
            var pe: String? = null
            var buy1_n: String? = null
            var market: String? = null
            var pb: String? = null
        }

        class IndexListBean {
            /**
             * yestodayClosePrice : 3222.1673
             * max52 : 0
             * diff_money : -3.2288
             * tradeNum : 89917531
             * code : sh000001
             * maxPrice : 3225.0546
             * nowPrice : 3218.9385
             * min52 : 0
             * time : 2017-04-18 11:11:42
             * name : 上证指数
             * tradeAmount : 102068196850
             * swing : 0.3923
             * todayOpenPrice : 3215.3963
             * diff_rate : -0.1002
             * minPrice : 3212.4147
             */

            var yestodayClosePrice: String? = null
            var max52: String? = null
            var diff_money: String? = null
            var tradeNum: String? = null
            var code: String? = null
            var maxPrice: String? = null
            var nowPrice: String? = null
            var min52: String? = null
            var time: String? = null
            var name: String? = null
            var tradeAmount: String? = null
            var swing: String? = null
            var todayOpenPrice: String? = null
            var diff_rate: String? = null
            var minPrice: String? = null
        }
    }
}
