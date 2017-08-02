# Note
It turns out that, it is a bug in spring data. An issue is created [here](https://jira.spring.io/browse/DATACMNS-1135)

# mongodb-buggy

This repo is generated for unwanted habit of mongodb mappingConverter which is explained in [this stackoverflow question](https://stackoverflow.com/questions/45432221/spring-data-mongodb-convert-document-falsely)

When reading and mapping the document, document's subdocument part is converted to incorrect type.
Buggy part of the document is experiences.values.$.responsibilities.values. Spring read document's experiences.values.$.responsibilities.$values as Experience class. But it should be Responsibility class.

And some other bizarre thing. If I remove all other variable from Candidate beside of _id and experiences variables, spring cannot convert document to object at all. It fails for experiences.values.$.projects.$.values.responsibilities
