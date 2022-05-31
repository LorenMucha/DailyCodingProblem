require 'tasks'

describe Tasks do
  describe '.calculate' do
    context 'given a array with intervalls' do
      tasks = Tasks.new
      it 'returns 1' do
        expect(tasks.calculate_interval([(7..9), (2..4), (5..8)])).to(eq(1))
      end
    end
  end
end
