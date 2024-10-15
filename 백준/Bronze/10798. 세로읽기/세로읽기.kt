import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {
    val sb = StringBuilder()
    val br: BufferedReader = BufferedReader(InputStreamReader(System.`in`))
    val list = ArrayList<String>()

    for (i in 0..4){
        list.add(br.readLine())
    }

    for (i in 0..14){
        for (j in list){
            if(j.length>=i+1){
                sb.append(j[i])
            }
        }
    }

    print(sb.toString())
    br.close()
}