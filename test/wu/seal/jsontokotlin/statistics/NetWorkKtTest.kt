package wu.seal.jsontokotlin.statistics

import com.google.gson.Gson
import org.junit.Before
import org.junit.Test
import wu.seal.jsontokotlin.test.TestConfig.isTestModel

/**
 *
 * Created by Seal.Wu on 2018/2/6.
 */
class NetWorkKtTest {
    @Before
    fun before() {
        isTestModel = true
    }
    @Test
    fun sendExceptionLog() {
        sendExceptionLog("Test exception Info")
    }

    @Test
    fun sendActionInfo() {
        sendActionInfo(Gson().toJson(StartAction()))
    }

    @Test
    fun sendHistoryExceptionInfoTest() {
        sendHistoryExceptionInfo()
    }

    @Test
    fun sendHistoryActionInfoTest() {
        sendHistoryActionInfo()
    }

    @Test
    fun sendConfigInfoTest() {
        sendConfigInfo()
    }

}