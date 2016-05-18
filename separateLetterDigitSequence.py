# "2.a.3.e" --> ['2','a','3','e']
# "134343434.asdflkjasdflkasf.34834.sdkjasfl"

# "M34.a.3.e" --> ['M34', 'a', '3', 'e']

# 2a3e
# M34a3e

def parseline(line):
  var isFirstItr = true;
  var wasLetter = false;
  var result = [];
  var tempStr = "";
  for letter in line:
    #numbers
    if letter.isdigit() || (letter.isalpha() && isFirstItr) then
      wasLetter = false;
      
      #add sequence into array if wasLetter
      if wasLetter then
        result.add(tempStr);
        tempStr = letter;
      else 
        #append string for number sequence
        tempStr += letter;
      end
      
    #letters
    else
      wasLetter = true;
      if wasLetter then  
        #append string for alpha sequence
        tempStr += letter;  
      else
        #add sequence into array if previously digit sequence
        result.add(tempStr);
        tempStr = letter;
      end
    end
    
    isFirstItr = false;
  end
  result;
end