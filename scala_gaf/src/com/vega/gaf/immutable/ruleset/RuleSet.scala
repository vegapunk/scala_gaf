package com.vega.gaf.immutable.environment
import com.vega.gaf.immutable.mutation.Mutation
import com.vega.gaf.immutable.crossover.Crossover
import com.vega.gaf.immutable.selection.Selection
import com.vega.gaf.immutable.crosschooser.CrossoverSelector

/**
 * 
 */
trait RuleSet[T] extends Mutation[T] with Crossover[T] with Selection[T] with CrossoverSelector[T]{

	/**
	 * Make a single iteration on a given Population returning a new Population.
	 */
	def iterate(env: Population[T]) : Population[T]
	
}