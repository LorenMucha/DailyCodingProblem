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

  def largest_prime_factor(number)
    max = number
    lower = 2
    while lower < max
      max /= lower while (max % lower).zero? && max != lower
      lower += 1
    end
    max
  end

  def generate_ip_from_string(input_string)
    result = ''
    ip_part = ''
    counter = 1
    input_string.each_char do |s|
      if s == '0'
        result += "#{ip_part}."
        counter = 1
        result += "#{s}."
        ip_part = ''
      elsif counter <= 3
        ip_part += s
        counter += 1
      else
        result += "#{ip_part}."
        counter = 1
        ip_part = s
      end
    end
    result + ip_part
  end
end
