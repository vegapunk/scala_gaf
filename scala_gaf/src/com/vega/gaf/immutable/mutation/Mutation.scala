package com.vega.gaf.immutable.mutation

import com.vega.gaf.immutable.gene.Gene

/**
 * Interface for Mutation
 */
trait Mutation[T] {

	/**
	 * Implementations should return a mutated version of the given Gene
	 */
	def mutate(gene:Gene[T]): Gene[T]

}