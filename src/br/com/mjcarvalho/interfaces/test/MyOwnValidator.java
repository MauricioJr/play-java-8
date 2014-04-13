package br.com.mjcarvalho.interfaces.test;

/**
 * 
 * @author mjcarvalho
 *
 * @param <T>
 * 
 * @FunctionalInterface garante que nao sera permitido tornar esta interface nao funcional 
 * acidentalmente, por exemplo, adicionando outra declaracao de metodo.
 */
@FunctionalInterface
public interface MyOwnValidator<T> {
	
	boolean isValid(T t);
}
