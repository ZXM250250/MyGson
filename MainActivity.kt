package com.example.myapplication

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.test1.test
import com.example.myapplication.test2.test2
import java.net.HttpURLConnection
import java.net.URL

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //测试一   课件里面的json数据
        val jsonData = "{\"school\":{\"name\":\"某中学\",\"presidnet\": {\"name\":\"王兮\",\"salary\":100000000,\"age\":30},\"student\": [{\"name\":\"A\",\"age\":19},{\"name\":\"B\",\"age\":19}, {\"name\":\"C\",\"age\":18}]}}"
        val my = MyGosn()
        var type = test()
        type=my.fromJsontoobject(jsonData,type.javaClass)
        Log.i("测试一","有数据返回吗"+type.javaClass)
        Log.i("测试一","有数据返回吗"+type.school.presidnet.name)  //嵌套类对象
        Log.i("测试一","有数据返回吗"+type.school.student[2].age.toInt())//集合对象

        //测试二 网易云接口数据
        var test2 = test2()
        test2 = my.fromJsontoobject(s,test2.javaClass)
        test2.tags.forEach{
            Log.i("测试二","有数据返回吗"+it.name)
            Log.i("测试二","有数据返回吗"+it.hot)
            Log.i("测试二","有数据返回吗"+it.category)
            Log.i("测试二","有数据返回吗"+it.id)
            Log.i("测试二","有数据返回吗"+it.type)
        }




//
//        Thread{
//            val u = "http://sandyz.ink:3000/playlist/highquality/tags"
//            val url = URL(u)
//            val connection = url.openConnection() as HttpURLConnection
//            connection.requestMethod = "GET"
//            connection.connectTimeout = 8000
//            connection.readTimeout = 8000
//            Log.i("测试heihi","来了")
//            val input = connection.inputStream
//            Log.i("测试heihi","数据回来了吗"+input)
//            Log.i("测试heihi","数据回来了吗")
//            connection.disconnect()
//        }.start()


    }


}//网易云接口访问不了了  这里直接粘贴json数据测试
 val s = "{\n" +
         "    \"tags\": [\n" +
         "        {\n" +
         "            \"id\": 5001,\n" +
         "            \"name\": \"华语\",\n" +
         "            \"type\": 0,\n" +
         "            \"category\": 0,\n" +
         "            \"hot\": false\n" +
         "        },\n" +
         "        {\n" +
         "            \"id\": 1045,\n" +
         "            \"name\": \"欧美\",\n" +
         "            \"type\": 1,\n" +
         "            \"category\": 0,\n" +
         "            \"hot\": false\n" +
         "        },\n" +
         "        {\n" +
         "            \"id\": 5003,\n" +
         "            \"name\": \"韩语\",\n" +
         "            \"type\": 1,\n" +
         "            \"category\": 0,\n" +
         "            \"hot\": false\n" +
         "        },\n" +
         "        {\n" +
         "            \"id\": 5002,\n" +
         "            \"name\": \"日语\",\n" +
         "            \"type\": 1,\n" +
         "            \"category\": 0,\n" +
         "            \"hot\": false\n" +
         "        },\n" +
         "        {\n" +
         "            \"id\": 2040,\n" +
         "            \"name\": \"粤语\",\n" +
         "            \"type\": 1,\n" +
         "            \"category\": 0,\n" +
         "            \"hot\": false\n" +
         "        },\n" +
         "        {\n" +
         "            \"id\": 10001,\n" +
         "            \"name\": \"另类/独立\",\n" +
         "            \"type\": 0,\n" +
         "            \"category\": 1,\n" +
         "            \"hot\": false\n" +
         "        },\n" +
         "        {\n" +
         "            \"id\": 5005,\n" +
         "            \"name\": \"R&B/Soul\",\n" +
         "            \"type\": 1,\n" +
         "            \"category\": 1,\n" +
         "            \"hot\": false\n" +
         "        },\n" +
         "        {\n" +
         "            \"id\": 2010,\n" +
         "            \"name\": \"民族\",\n" +
         "            \"type\": 1,\n" +
         "            \"category\": 1,\n" +
         "            \"hot\": false\n" +
         "        },\n" +
         "        {\n" +
         "            \"id\": 1031,\n" +
         "            \"name\": \"怀旧\",\n" +
         "            \"type\": 0,\n" +
         "            \"category\": 3,\n" +
         "            \"hot\": false\n" +
         "        },\n" +
         "        {\n" +
         "            \"id\": 2042,\n" +
         "            \"name\": \"小语种\",\n" +
         "            \"type\": 1,\n" +
         "            \"category\": 0,\n" +
         "            \"hot\": false\n" +
         "        },\n" +
         "        {\n" +
         "            \"id\": 2017,\n" +
         "            \"name\": \"学习\",\n" +
         "            \"type\": 0,\n" +
         "            \"category\": 2,\n" +
         "            \"hot\": false\n" +
         "        },\n" +
         "        {\n" +
         "            \"id\": 1015,\n" +
         "            \"name\": \"夜晚\",\n" +
         "            \"type\": 0,\n" +
         "            \"category\": 2,\n" +
         "            \"hot\": false\n" +
         "        },\n" +
         "        {\n" +
         "            \"id\": 4001,\n" +
         "            \"name\": \"运动\",\n" +
         "            \"type\": 0,\n" +
         "            \"category\": 2,\n" +
         "            \"hot\": false\n" +
         "        },\n" +
         "        {\n" +
         "            \"id\": 11002,\n" +
         "            \"name\": \"ACG\",\n" +
         "            \"type\": 0,\n" +
         "            \"category\": 4,\n" +
         "            \"hot\": false\n" +
         "        },\n" +
         "        {\n" +
         "            \"id\": 13001,\n" +
         "            \"name\": \"Bossa Nova\",\n" +
         "            \"type\": 1,\n" +
         "            \"category\": 1,\n" +
         "            \"hot\": false\n" +
         "        },\n" +
         "        {\n" +
         "            \"id\": 9001,\n" +
         "            \"name\": \"影视原声\",\n" +
         "            \"type\": 0,\n" +
         "            \"category\": 4,\n" +
         "            \"hot\": false\n" +
         "        },\n" +
         "        {\n" +
         "            \"id\": 1,\n" +
         "            \"name\": \"流行\",\n" +
         "            \"type\": 0,\n" +
         "            \"category\": 1,\n" +
         "            \"hot\": false\n" +
         "        },\n" +
         "        {\n" +
         "            \"id\": 1030,\n" +
         "            \"name\": \"性感\",\n" +
         "            \"type\": 1,\n" +
         "            \"category\": 3,\n" +
         "            \"hot\": false\n" +
         "        },\n" +
         "        {\n" +
         "            \"id\": 2,\n" +
         "            \"name\": \"摇滚\",\n" +
         "            \"type\": 0,\n" +
         "            \"category\": 1,\n" +
         "            \"hot\": false\n" +
         "        },\n" +
         "        {\n" +
         "            \"id\": 1005,\n" +
         "            \"name\": \"英伦\",\n" +
         "            \"type\": 1,\n" +
         "            \"category\": 1,\n" +
         "            \"hot\": false\n" +
         "        },\n" +
         "        {\n" +
         "            \"id\": 16001,\n" +
         "            \"name\": \"后摇\",\n" +
         "            \"type\": 1,\n" +
         "            \"category\": 1,\n" +
         "            \"hot\": false\n" +
         "        },\n" +
         "        {\n" +
         "            \"id\": 12001,\n" +
         "            \"name\": \"古风\",\n" +
         "            \"type\": 1,\n" +
         "            \"category\": 1,\n" +
         "            \"hot\": false\n" +
         "        },\n" +
         "        {\n" +
         "            \"id\": 1001,\n" +
         "            \"name\": \"民谣\",\n" +
         "            \"type\": 0,\n" +
         "            \"category\": 1,\n" +
         "            \"hot\": false\n" +
         "        },\n" +
         "        {\n" +
         "            \"id\": 5009,\n" +
         "            \"name\": \"90后\",\n" +
         "            \"type\": 1,\n" +
         "            \"category\": 4,\n" +
         "            \"hot\": false\n" +
         "        },\n" +
         "        {\n" +
         "            \"id\": 1009,\n" +
         "            \"name\": \"蓝调\",\n" +
         "            \"type\": 1,\n" +
         "            \"category\": 1,\n" +
         "            \"hot\": false\n" +
         "        },\n" +
         "        {\n" +
         "            \"id\": 1010,\n" +
         "            \"name\": \"乡村\",\n" +
         "            \"type\": 1,\n" +
         "            \"category\": 1,\n" +
         "            \"hot\": false\n" +
         "        },\n" +
         "        {\n" +
         "            \"id\": 2031,\n" +
         "            \"name\": \"安静\",\n" +
         "            \"type\": 1,\n" +
         "            \"category\": 3,\n" +
         "            \"hot\": false\n" +
         "        },\n" +
         "        {\n" +
         "            \"id\": 2025,\n" +
         "            \"name\": \"浪漫\",\n" +
         "            \"type\": 1,\n" +
         "            \"category\": 3,\n" +
         "            \"hot\": false\n" +
         "        },\n" +
         "        {\n" +
         "            \"id\": 1027,\n" +
         "            \"name\": \"快乐\",\n" +
         "            \"type\": 1,\n" +
         "            \"category\": 3,\n" +
         "            \"hot\": false\n" +
         "        },\n" +
         "        {\n" +
         "            \"id\": 1041,\n" +
         "            \"name\": \"经典\",\n" +
         "            \"type\": 1,\n" +
         "            \"category\": 4,\n" +
         "            \"hot\": false\n" +
         "        },\n" +
         "        {\n" +
         "            \"id\": 7003,\n" +
         "            \"name\": \"世界音乐\",\n" +
         "            \"type\": 1,\n" +
         "            \"category\": 1,\n" +
         "            \"hot\": false\n" +
         "        },\n" +
         "        {\n" +
         "            \"id\": 2008,\n" +
         "            \"name\": \"轻音乐\",\n" +
         "            \"type\": 0,\n" +
         "            \"category\": 1,\n" +
         "            \"hot\": false\n" +
         "        },\n" +
         "        {\n" +
         "            \"id\": 2004,\n" +
         "            \"name\": \"电子\",\n" +
         "            \"type\": 0,\n" +
         "            \"category\": 1,\n" +
         "            \"hot\": false\n" +
         "        },\n" +
         "        {\n" +
         "            \"id\": 1049,\n" +
         "            \"name\": \"器乐\",\n" +
         "            \"type\": 1,\n" +
         "            \"category\": 4,\n" +
         "            \"hot\": false\n" +
         "        },\n" +
         "        {\n" +
         "            \"id\": 5004,\n" +
         "            \"name\": \"说唱\",\n" +
         "            \"type\": 1,\n" +
         "            \"category\": 1,\n" +
         "            \"hot\": false\n" +
         "        },\n" +
         "        {\n" +
         "            \"id\": 1012,\n" +
         "            \"name\": \"古典\",\n" +
         "            \"type\": 1,\n" +
         "            \"category\": 1,\n" +
         "            \"hot\": false\n" +
         "        },\n" +
         "        {\n" +
         "            \"id\": 2007,\n" +
         "            \"name\": \"爵士\",\n" +
         "            \"type\": 1,\n" +
         "            \"category\": 1,\n" +
         "            \"hot\": false\n" +
         "        }\n" +
         "    ],\n" +
         "    \"code\": 200\n" +
         "}"