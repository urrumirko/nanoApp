export abstract class FixtureFactory<T> {
/**
 * Build a fixture object populating all its attibutes with fake values.
 */
abstract build(attributes?): T;

}
