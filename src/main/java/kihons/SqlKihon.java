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
        return "Select *From Person";
    }

    @Override
    protected String selectAllFieldsFromPersonJoinedToAddress() {
        return "Select * From Person p Join address a On p.PersonId = a.PersonID";
    }

    @Override
    protected String selectFirstNameFromPersonWhereLastNameEqualsRayburn() {
        return "Select firstName from Person Where lastName = 'Rayburn'";
    }

    @Override
    protected String selectAllFieldsFromPersonLeftOuterJoinedToAddress() {
        return "Select * From Person p Left Outer Join address a on p.personID = a.personId";
    }

    @Override
    protected String insertPersonId4NamedMikeJohnsonAge5ToPerson() {
        return "Insert into Person(PersonId, firstName, LastName, Age) Values (4, 'Mike', 'Johnson', 5)";
    }

    @Override
    protected String updateAllLastNamesRayburnToJohnsonInPerson() {
        return "Update Person Set LastName = 'Johnson' Where lastName = 'Rayburn'" ;
    }
}
