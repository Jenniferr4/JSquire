package kihons;

import framework.exceptions.NotImplementedYetException;
import framework.bases.SqlKihonBase;

public class SqlKihon extends SqlKihonBase {

    /* Given SQL Tables defined as:
     * ----------------------------
     * CREATE TABLE Person
       (
         PersonId int not null PRIMARY KEY,
         FirstName varchar(50),
         LastName varchar(50),
         Age int
       )
     *
     * CREATE TABLE Address
       (
         AddressId int not null PRIMARY KEY,
         PersonId int,
         Line1 varchar(50),
         Line2 varchar(50),
         City varchar(50),
         State varchar(50),
         Zip varchar(9)
       )
     */

    @Override
    protected String Select_All_Fields_And_Rows_From_Person() {
        return "Select * from Person";
    }

    @Override
    protected String selectAllFieldsFromPersonJoinedToAddress() {
        return "Select * From Person p join address a on p.personId= a.PersonId";
    }

    @Override
    protected String selectFirstNameFromPersonWhereLastNameEqualsRayburn() {
        return "Select firstName from Person Where lastName ='Rayburn'";
    }

    @Override
    protected String selectAllFieldsFromPersonLeftOuterJoinedToAddress() {
        return "Select * From person p left outer join address a on p.personId = a.personId";
    }

    @Override
    protected String insertPersonId4NamedMikeJohnsonAge5ToPerson() {
        return "insert into Person(PersonId, firstName, LastName, Age) values (4, 'Mike', 'Johnson', 5)";
    }

    @Override
    protected String updateAllLastNamesRayburnToJohnsonInPerson() {
        return "Update Person SET lastName = 'Johnson' where lastName = 'Rayburn'";
    }
}
