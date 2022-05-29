require 'problem_one'

describe IntervalCalculator do
  describe '.calculate' do
    context 'given a array with intervalls' do
      it 'returns 1' do
        given_interval = [(7..9), (2..4), (5..8)]
        expect(IntervalCalculator.claculate(given_interval)).to(eq(1))
      end
    end
  end
end
