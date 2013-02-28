/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.test.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class XTestCase_64_69 extends org.jooq.impl.UpdatableTableImpl<org.jooq.test.oracle.generatedclasses.test.tables.records.XTestCase_64_69Record> {

	private static final long serialVersionUID = -1964447876;

	/**
	 * The singleton instance of <code>TEST.X_TEST_CASE_64_69</code>
	 */
	public static final org.jooq.test.oracle.generatedclasses.test.tables.XTestCase_64_69 X_TEST_CASE_64_69 = new org.jooq.test.oracle.generatedclasses.test.tables.XTestCase_64_69();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.oracle.generatedclasses.test.tables.records.XTestCase_64_69Record> getRecordType() {
		return org.jooq.test.oracle.generatedclasses.test.tables.records.XTestCase_64_69Record.class;
	}

	/**
	 * The column <code>TEST.X_TEST_CASE_64_69.ID</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.oracle.generatedclasses.test.tables.records.XTestCase_64_69Record, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>TEST.X_TEST_CASE_64_69.UNUSED_ID</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.oracle.generatedclasses.test.tables.records.XTestCase_64_69Record, java.lang.Integer> UNUSED_ID = createField("UNUSED_ID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * Create a <code>TEST.X_TEST_CASE_64_69</code> table reference
	 */
	public XTestCase_64_69() {
		super("X_TEST_CASE_64_69", org.jooq.test.oracle.generatedclasses.test.Test.TEST);
	}

	/**
	 * Create an aliased <code>TEST.X_TEST_CASE_64_69</code> table reference
	 */
	public XTestCase_64_69(java.lang.String alias) {
		super(alias, org.jooq.test.oracle.generatedclasses.test.Test.TEST, org.jooq.test.oracle.generatedclasses.test.tables.XTestCase_64_69.X_TEST_CASE_64_69);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.test.oracle.generatedclasses.test.tables.records.XTestCase_64_69Record> getPrimaryKey() {
		return org.jooq.test.oracle.generatedclasses.test.UniqueKeys.XTestCase_64_69.PK_X_TEST_CASE_64_69;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.oracle.generatedclasses.test.tables.records.XTestCase_64_69Record>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.oracle.generatedclasses.test.tables.records.XTestCase_64_69Record>>asList(org.jooq.test.oracle.generatedclasses.test.UniqueKeys.XTestCase_64_69.PK_X_TEST_CASE_64_69);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<org.jooq.test.oracle.generatedclasses.test.tables.records.XTestCase_64_69Record, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.test.oracle.generatedclasses.test.tables.records.XTestCase_64_69Record, ?>>asList(org.jooq.test.oracle.generatedclasses.test.ForeignKeys.XTestCase_64_69.FK_X_TEST_CASE_64_69A, org.jooq.test.oracle.generatedclasses.test.ForeignKeys.XTestCase_64_69.FK_X_TEST_CASE_64_69B);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.test.oracle.generatedclasses.test.tables.XTestCase_64_69 as(java.lang.String alias) {
		return new org.jooq.test.oracle.generatedclasses.test.tables.XTestCase_64_69(alias);
	}
}
