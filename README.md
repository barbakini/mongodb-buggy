# mongodb-buggy

buggy part of the document is experiences.values.$.responsibilities.values. Spring read document's experiences.values.$.responsibilities.$values as Experience class.

And some other bizarre thing. If I remove all other variable from Candidate beside of _id and experiences variables, spring cannot convert document to object at all. It fails for experiences.values.$.projects.$.values.responsibilities
