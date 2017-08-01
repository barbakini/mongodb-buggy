# mongodb-buggy

buggy part of the document is experiences.values.$.responsibility. Spring read document's experiences.values.$.responsibility as Experience class.

And some other bizarre thing. If I remove all other variable from Candidate beside of _id and experiences variable, spring cannot convert document to object at all. It fails for experiences.values.$.project.responsibility
