package com.vega.gaf.immutable.environment
import com.vega.gaf.immutable.chromosome.Chromosome

/**
 * Class encapsulates a population of Chromosomes of type T
 */
protected class Population[T](pop:List[Chromosome[T]]) {

	val population = pop	
}

object Population{
	/**
	 * Creates a new Environment from the given list of chromosomes
	 */
	def apply[T](pop:List[Chromosome[T]] ) : Population[T] = new Population(pop)

	/**
	 * Creates a new Environment from the given environment and a list of Chromosomes, the Environments population
	 * will contain all the members of the old population with the members of the new list
	 */
	def apply[T](env:Population[T], newPop:List[Chromosome[T]]) = new Population(newPop ::: env.population)
	
	/**
	 * Creates a new Environment from the given environment and a single Chromosome, the new Environment's population 
	 * will contain all the members of the old Environment's population and the given Chromosome
	 */
	def apply[T](env:Population[T], chrom:Chromosome[T]) = new Population(chrom :: env.population)
}