import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val sb = StringBuilder()

    val n = br.readLine().trim().toInt()
    var count = 0

    val map = Array(100) { _ -> IntArray(100) { _ -> 0 } }

    for (i in 0..<n){
        val st = StringTokenizer(br.readLine(), " ")
        val a = st.nextToken().toInt()
        val b = st.nextToken().toInt()

        for (j in 0..<10){
            for (k in 0..<10){
                map[100 - a - j][100 - b - k] = 1
            }
        }
    }

    for (i in 0..99){
        for (j in 0..99){
            if (map[i][j] == 1){
                count++
            }
        }
    }

    sb.append(count)
    print(sb.toString())
    br.close()
}