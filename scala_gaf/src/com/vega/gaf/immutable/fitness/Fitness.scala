package com.vega.gaf.immutable.fitness
import com.vega.gaf.immutable.chromosome.Chromosome

trait Fitness[T, M] {

/**
 * Returns the fitness of type M of a chromosome of type T
 */
  def fitness(chrom: Chromosome[T]) : M

}