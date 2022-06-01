require 'task'

describe Task do
  let(:tasks) { Task.new }
  context 'given a array with intervalls' do
    it 'returns 1' do
      expect(tasks.calculate_interval([(7..9), (2..4), (5..8)])).to(eq(1))
    end
  end
  context 'search the largest prime factor' do
    it 'finds the largest prime factor for a given number' do
      expect(tasks.largest_prime_factor(13_195)).to(eq(29))
    end
  end
end
