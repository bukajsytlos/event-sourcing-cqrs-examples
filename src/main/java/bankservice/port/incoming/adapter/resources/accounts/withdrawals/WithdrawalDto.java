package bankservice.port.incoming.adapter.resources.accounts.withdrawals;

import static com.fasterxml.jackson.annotation.JsonProperty.Access.READ_ONLY;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;
import java.util.UUID;
import javax.validation.constraints.NotNull;

public class WithdrawalDto {

  @JsonProperty(access = READ_ONLY)
  private UUID accountId;

  @NotNull
  private BigDecimal amount;


  @SuppressWarnings("unused")
  public UUID getAccountId() {
    return accountId;
  }

  @SuppressWarnings("unused")
  public void setAccountId(UUID accountId) {
    this.accountId = accountId;
  }

  @SuppressWarnings("unused")
  public BigDecimal getAmount() {
    return amount;
  }

  @SuppressWarnings("unused")
  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }
}
