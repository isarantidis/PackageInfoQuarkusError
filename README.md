# Project for quarkus issue 27003

There are two aspects:

First, the registration of package-info classes to be bound to Jaxb Context results in the error: package-info is an interface, and JAXB can't handle interfaces.
Second, the inclusion of any camel quarkus dependency that results in the camel-core-model to
be included results in errors such as Two classes have the same XML type name "http://camel.apache.org/schema/spring}packageInfo". Use @XmlType.name and @XmlType.namespace to assign different names to them.