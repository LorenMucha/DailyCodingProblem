module Solutions
  def calculate_interval(input)
    x = 0
    count = 0
    input.each do |el|
      last = el.last
      next unless x < input.length - 1

      first = input[x + 1].first
      count += 1 if last >= first
      x += 1
    end
    count
  end
end
