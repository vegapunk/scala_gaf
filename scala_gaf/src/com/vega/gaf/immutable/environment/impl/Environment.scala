package com.vega.gaf.immutable.environment
import com.vega.gaf.immutable.chromosome.Chromosome

/**
 * Class encapsulates a population of Chromosomes of type T
 */
protected class Environment[T](pop:List[Chromosome[T]]) {

	val population = pop	
}

object Environment{
	/**
	 * Creates a new Environment from the given list of chromosomes
	 */
	def apply[T](pop:List[Chromosome[T]] ) : Environment[T] = new Environment(pop)

	/**
	 * Creates a new Environment from the given environment and a list of Chromosomes, the Environments population
	 * will contain all the members of the old population with the members of the new list
	 */
	def apply[T](env:Environment[T], newPop:List[Chromosome[T]]) = new Environment(newPop ::: env.population)
	
	/**
	 * Creates a new Environment from the given environment and a single Chromosome, the new Environment's population 
	 * will contain all the members of the old Environment's population and the given Chromosome
	 */
	def apply[T](env:Environment[T], chrom:Chromosome[T]) = new Environment(chrom :: env.population)
}