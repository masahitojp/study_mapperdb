package me.masahito.dao

import com.googlecode.mapperdao._

// domain model classes (immutable)
class Person(val name: String, val company: Company)

object PersonEntity extends Entity[Int,SurrogateIntId, Person] {
  val id = key("id") autogenerated (_.id)
  val name = column("name") to (_.name)
  val company = manytoone(CompanyEntity) to (_.company)

  def constructor(implicit mm: ValuesMap) = new Person(name, company) with Stored {
    val id: Int = PersonEntity.id
  }
}
