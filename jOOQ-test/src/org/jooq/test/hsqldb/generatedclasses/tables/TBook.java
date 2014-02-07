/**
 * This class is generated by jOOQ
 */
package org.jooq.test.hsqldb.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TBook extends org.jooq.impl.TableImpl<org.jooq.test.hsqldb.generatedclasses.tables.records.TBookRecord> {

	private static final long serialVersionUID = 941549658;

	/**
	 * The singleton instance of <code>PUBLIC.T_BOOK</code>
	 */
	public static final org.jooq.test.hsqldb.generatedclasses.tables.TBook T_BOOK = new org.jooq.test.hsqldb.generatedclasses.tables.TBook();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.hsqldb.generatedclasses.tables.records.TBookRecord> getRecordType() {
		return org.jooq.test.hsqldb.generatedclasses.tables.records.TBookRecord.class;
	}

	/**
	 * The column <code>PUBLIC.T_BOOK.ID</code>.
	 */
	public final org.jooq.TableField<org.jooq.test.hsqldb.generatedclasses.tables.records.TBookRecord, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>PUBLIC.T_BOOK.AUTHOR_ID</code>.
	 */
	public final org.jooq.TableField<org.jooq.test.hsqldb.generatedclasses.tables.records.TBookRecord, java.lang.Integer> AUTHOR_ID = createField("AUTHOR_ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>PUBLIC.T_BOOK.CO_AUTHOR_ID</code>.
	 */
	public final org.jooq.TableField<org.jooq.test.hsqldb.generatedclasses.tables.records.TBookRecord, java.lang.Integer> CO_AUTHOR_ID = createField("CO_AUTHOR_ID", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>PUBLIC.T_BOOK.DETAILS_ID</code>.
	 */
	public final org.jooq.TableField<org.jooq.test.hsqldb.generatedclasses.tables.records.TBookRecord, java.lang.Integer> DETAILS_ID = createField("DETAILS_ID", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>PUBLIC.T_BOOK.TITLE</code>.
	 */
	public final org.jooq.TableField<org.jooq.test.hsqldb.generatedclasses.tables.records.TBookRecord, java.lang.String> TITLE = createField("TITLE", org.jooq.impl.SQLDataType.VARCHAR.length(400).nullable(false), this, "");

	/**
	 * The column <code>PUBLIC.T_BOOK.PUBLISHED_IN</code>.
	 */
	public final org.jooq.TableField<org.jooq.test.hsqldb.generatedclasses.tables.records.TBookRecord, java.lang.Integer> PUBLISHED_IN = createField("PUBLISHED_IN", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>PUBLIC.T_BOOK.LANGUAGE_ID</code>.
	 */
	public final org.jooq.TableField<org.jooq.test.hsqldb.generatedclasses.tables.records.TBookRecord, java.lang.Integer> LANGUAGE_ID = createField("LANGUAGE_ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>PUBLIC.T_BOOK.CONTENT_TEXT</code>.
	 */
	public final org.jooq.TableField<org.jooq.test.hsqldb.generatedclasses.tables.records.TBookRecord, java.lang.String> CONTENT_TEXT = createField("CONTENT_TEXT", org.jooq.impl.SQLDataType.VARCHAR.length(16777216), this, "");

	/**
	 * The column <code>PUBLIC.T_BOOK.CONTENT_PDF</code>.
	 */
	public final org.jooq.TableField<org.jooq.test.hsqldb.generatedclasses.tables.records.TBookRecord, byte[]> CONTENT_PDF = createField("CONTENT_PDF", org.jooq.impl.SQLDataType.VARBINARY.length(16777216), this, "");

	/**
	 * The column <code>PUBLIC.T_BOOK.REC_VERSION</code>.
	 */
	public final org.jooq.TableField<org.jooq.test.hsqldb.generatedclasses.tables.records.TBookRecord, java.lang.Integer> REC_VERSION = createField("REC_VERSION", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>PUBLIC.T_BOOK.REC_TIMESTAMP</code>.
	 */
	public final org.jooq.TableField<org.jooq.test.hsqldb.generatedclasses.tables.records.TBookRecord, java.sql.Timestamp> REC_TIMESTAMP = createField("REC_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

	/**
	 * Create a <code>PUBLIC.T_BOOK</code> table reference
	 */
	public TBook() {
		this("T_BOOK", null);
	}

	/**
	 * Create an aliased <code>PUBLIC.T_BOOK</code> table reference
	 */
	public TBook(java.lang.String alias) {
		this(alias, org.jooq.test.hsqldb.generatedclasses.tables.TBook.T_BOOK);
	}

	private TBook(java.lang.String alias, org.jooq.Table<org.jooq.test.hsqldb.generatedclasses.tables.records.TBookRecord> aliased) {
		this(alias, aliased, null);
	}

	private TBook(java.lang.String alias, org.jooq.Table<org.jooq.test.hsqldb.generatedclasses.tables.records.TBookRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, org.jooq.test.hsqldb.generatedclasses.Public.PUBLIC, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.test.hsqldb.generatedclasses.tables.records.TBookRecord> getPrimaryKey() {
		return org.jooq.test.hsqldb.generatedclasses.Keys.PK_T_BOOK;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.hsqldb.generatedclasses.tables.records.TBookRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.hsqldb.generatedclasses.tables.records.TBookRecord>>asList(org.jooq.test.hsqldb.generatedclasses.Keys.PK_T_BOOK);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<org.jooq.test.hsqldb.generatedclasses.tables.records.TBookRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.test.hsqldb.generatedclasses.tables.records.TBookRecord, ?>>asList(org.jooq.test.hsqldb.generatedclasses.Keys.FK_T_BOOK_AUTHOR_ID, org.jooq.test.hsqldb.generatedclasses.Keys.FK_T_BOOK_CO_AUTHOR_ID, org.jooq.test.hsqldb.generatedclasses.Keys.FK_T_BOOK_LANGUAGE_ID);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.TableField<org.jooq.test.hsqldb.generatedclasses.tables.records.TBookRecord, java.lang.Integer> getRecordVersion() {
		return org.jooq.test.hsqldb.generatedclasses.tables.TBook.T_BOOK.REC_VERSION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.TableField<org.jooq.test.hsqldb.generatedclasses.tables.records.TBookRecord, java.sql.Timestamp> getRecordTimestamp() {
		return org.jooq.test.hsqldb.generatedclasses.tables.TBook.T_BOOK.REC_TIMESTAMP;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.test.hsqldb.generatedclasses.tables.TBook as(java.lang.String alias) {
		return new org.jooq.test.hsqldb.generatedclasses.tables.TBook(alias, this);
	}

	/**
	 * Rename this table
	 */
	public org.jooq.test.hsqldb.generatedclasses.tables.TBook rename(java.lang.String name) {
		return new org.jooq.test.hsqldb.generatedclasses.tables.TBook(name, null);
	}
}
