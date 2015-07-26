package daos

import play.api.db.DB

class NumberDao {

  def generateNumbers(): List[Int] = {
    val conn = DB.getConnection()

    var resultList = Nil
    try {
      val stmt = conn.createStatement
      val rs = stmt.executeQuery("SELECT numb from test_table")

      while (rs.next()) {
        resultList += rs.getString("numb")
      }
    } finally {
      conn.close()
    }

    resultList
  }

}
